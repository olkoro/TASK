package com.olkoro.demo.repository;

import com.olkoro.demo.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterRepository extends JpaRepository<Master, Long> {
}
