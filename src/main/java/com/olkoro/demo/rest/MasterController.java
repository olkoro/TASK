package com.olkoro.demo.rest;

import com.olkoro.demo.model.Master;
import com.olkoro.demo.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MasterController {

    private MasterRepository masterRepository;

    @Autowired
    public MasterController(MasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    @GetMapping("/masters/all")
    public List<Master> allMasters() {
        return masterRepository.findAll();
    }

}
