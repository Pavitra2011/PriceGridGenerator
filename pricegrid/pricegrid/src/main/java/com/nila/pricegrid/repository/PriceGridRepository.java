package com.nila.pricegrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nila.pricegrid.domain.PriceGridDomain;

public interface PriceGridRepository extends JpaRepository<PriceGridDomain, Long>{

}
