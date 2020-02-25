package com.olkoro.demo.rest;

import com.olkoro.demo.model.Service;
import com.olkoro.demo.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {

    private ServiceRepository serviceRepository;

    @Autowired
    public ServiceController(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @GetMapping("/services/all")
    public List<Service> allServices() {
        return serviceRepository.findAll();
    }

    @GetMapping("/services/{id}")
    public Service getService(@PathVariable Long id){
        return serviceRepository.getOne(id);
    }

    @PostMapping("/services/")
    public Service PostService(@RequestBody Service service){
        return serviceRepository.save(service);
    }

    @DeleteMapping ("/services/{id}")
    public void deleteOrder(@PathVariable Long id) {
        serviceRepository.delete(serviceRepository.getOne(id));
    }
}