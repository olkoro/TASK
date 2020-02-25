package com.olkoro.demo.repository;

import com.olkoro.demo.model.MasterService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterServiceRepository extends JpaRepository<MasterService, Long> {
    List<MasterService> findByMasterId(Long id);
}
