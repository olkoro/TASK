package com.olkoro.demo.rest;

import com.olkoro.demo.model.Master;
import com.olkoro.demo.model.MasterService;
import com.olkoro.demo.model.Service;
import com.olkoro.demo.repository.MasterRepository;
import com.olkoro.demo.repository.MasterServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MasterController {

    private MasterRepository masterRepository;

    @Autowired
    public MasterController(MasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/masters/all")
    public List<Master> allMasters() { return masterRepository.findAll(); }

    @GetMapping("/masters/{id}")
    public Master getMaster(@PathVariable Long id){
        return masterRepository.getOne(id);
    }
    @GetMapping("/masters/{id}/services")
    public List<Service> getMasterServices(@PathVariable Long id){
        List<MasterService> masterServices;
        return null;
    }
    @PostMapping("/masters")
    public Master PostMaster(@RequestBody Master master){
        return masterRepository.save(master);
    }

}
