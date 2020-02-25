package com.olkoro.demo.repository;

import com.olkoro.demo.model.WorkHours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkHoursRepository extends JpaRepository<WorkHours, Long> {
}
