package com.olkoro.demo.rest;

import com.olkoro.demo.model.Master;
import com.olkoro.demo.model.MasterService;
import com.olkoro.demo.repository.MasterServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MasterServiceController {

    private MasterServiceRepository masterServiceRepository;

    @Autowired
    public MasterServiceController(MasterServiceRepository masterServiceRepository) {
        this.masterServiceRepository = masterServiceRepository;
    }

    @GetMapping("/masterServices/all")
    public List<MasterService> allMasterServices() {
        return masterServiceRepository.findAll();
    }

    @GetMapping("/masterServices/{id}")
    public MasterService getMasterService(@PathVariable Long id){
        return masterServiceRepository.getOne(id);
    }

    @GetMapping("/masterServices/masters/{id}")
    public List<MasterService> getMasterMasterService(@PathVariable Long id){
        return masterServiceRepository.findByMasterId(id);
    }

    @PostMapping("/masterServices/")
    public MasterService PostMasterService(@RequestBody MasterService masterService){
        return masterServiceRepository.save(masterService);
    }
    @DeleteMapping ("/masterServices/{id}")
    public void deleteOrder(@PathVariable Long id) {
        masterServiceRepository.delete(masterServiceRepository.getOne(id));
    }
}