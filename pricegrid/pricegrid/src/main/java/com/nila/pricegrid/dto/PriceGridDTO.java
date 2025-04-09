package com.nila.pricegrid.dto;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PriceGridDTO {

	@Positive(message = "Height must be greater than 0")
    private Integer height;

    @Positive(message = "Width must be greater than 0")
    private Integer width;

    @Positive(message = "Price must be greater than 0")
    private Double price;

	
}
