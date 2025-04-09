package com.nila.pricegrid.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="price_grid")
public class PriceGridDomain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Height is mandatory")
	@Positive(message = "Height must be greater than 0")
	@Column
	
	private Integer height;
	@NotEmpty(message="Width is mandatory")
	@Positive(message = "Width must be greater than 0")
	@Column
	private Integer width;
	@Column
	@PositiveOrZero(message = "Price must be zero or more")
	private Double price;
	
	 public PriceGridDomain(Integer height, Integer width, Double price) {
	        this.height	 = height;
	        this.width = width;
	        this.price = price;
	    }


}
