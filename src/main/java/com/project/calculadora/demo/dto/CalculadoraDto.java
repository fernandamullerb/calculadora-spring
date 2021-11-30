package com.project.calculadora.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalculadoraDto {
	
	@JsonProperty(value = "primeiro_valor")
	private BigDecimal primeiroValor;

	@JsonProperty(value = "segundo_valor")
	private BigDecimal segundoValor;
	
}
