package com.olkoro.demo.rest;

import com.olkoro.demo.model.WorkHours;
import com.olkoro.demo.repository.WorkHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkHoursController {

    private WorkHoursRepository workHoursRepository;

    @Autowired
    public WorkHoursController(WorkHoursRepository workHoursRepository) {
        this.workHoursRepository = workHoursRepository;
    }

    @GetMapping("/workHours/all")
    public List<WorkHours> allWorkHourss() {
        return workHoursRepository.findAll();
    }

    @GetMapping("/workHours/{id}")
    public WorkHours getWorkHours(@PathVariable Long id){
        return workHoursRepository.getOne(id);
    }

    @PostMapping("/workHours")
    public WorkHours PostWorkHours(@RequestBody WorkHours workHours){
        return workHoursRepository.save(workHours);
    }

    @DeleteMapping ("/workHours/{id}")
    public void deleteOrder(@PathVariable Long id) {
        workHoursRepository.delete(workHoursRepository.getOne(id));
    }
}