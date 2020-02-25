package com.olkoro.demo.repository;

import com.olkoro.demo.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
