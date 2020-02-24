package com.olkoro.demo.repository;

import com.olkoro.demo.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterRepository extends JpaRepository<Master, Long> {
}
