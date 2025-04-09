package com.nila.pricegrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nila.pricegrid.domain.PriceGridDomain;
import com.nila.pricegrid.dto.PriceGridDTO;
import com.nila.pricegrid.repository.PriceGridRepository;

@Service
public class PriceGridService {

    @Autowired
    private PriceGridRepository priceGridRepository;

    public PriceGridDomain savePriceGrid(PriceGridDTO dto) {
        PriceGridDomain priceGrid = new PriceGridDomain();
        priceGrid.setHeight(dto.getHeight());
        priceGrid.setWidth(dto.getWidth());
        priceGrid.setPrice(dto.getPrice());

        return priceGridRepository.save(priceGrid);
    }

    public PriceGridDomain getPriceGridById(Long id) {
        return priceGridRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PriceGrid Not Found with id: " + id));
    }
    
    public List<PriceGridDomain> getAllPriceGrids() {
        return priceGridRepository.findAll();
    }

}