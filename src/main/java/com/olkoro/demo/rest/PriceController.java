package com.olkoro.demo.rest;

import com.olkoro.demo.model.Price;
import com.olkoro.demo.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PriceController {

    private PriceRepository priceRepository;

    @Autowired
    public PriceController(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @GetMapping("/prices/all")
    public List<Price> allPrices() {
        return priceRepository.findAll();
    }

    @GetMapping("/prices/{id}")
    public Price getPrice(@PathVariable Long id){
        return priceRepository.getOne(id);
    }

    @PostMapping("/prices")
    public Price PostPrice(@RequestBody Price price){
        return priceRepository.save(price);
    }

    @DeleteMapping ("/prices/{id}")
    public void deleteOrder(@PathVariable Long id) {
        priceRepository.delete(priceRepository.getOne(id));
    }
}