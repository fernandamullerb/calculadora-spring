package com.project.calculadora.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Builder  
@NoArgsConstructor  
@AllArgsConstructor 
public class CalculadoraDto {
	
	@JsonProperty(value = "primeiroValor")
	private int var1;
	@JsonProperty(value = "segundoValor")
	private int var2;
	
}
