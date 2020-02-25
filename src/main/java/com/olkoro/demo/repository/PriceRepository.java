package com.olkoro.demo.repository;

import com.olkoro.demo.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
