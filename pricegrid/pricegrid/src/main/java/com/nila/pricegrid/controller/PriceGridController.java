package com.nila.pricegrid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nila.pricegrid.domain.PriceGridDomain;
import com.nila.pricegrid.dto.PriceGridDTO;
import com.nila.pricegrid.service.PriceGridService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/price-grid")
public class PriceGridController {

    @Autowired
    private PriceGridService priceGridService;

    @PostMapping("/createPriceGrid")
    public ResponseEntity<PriceGridDomain> createPriceGrid(@Valid @RequestBody PriceGridDTO dto) {
        return ResponseEntity.ok(priceGridService.savePriceGrid(dto));
    }

    @GetMapping
    public ResponseEntity<List<PriceGridDomain>> getAllPriceGrids() {
        return ResponseEntity.ok(priceGridService.getAllPriceGrids());
    }
}