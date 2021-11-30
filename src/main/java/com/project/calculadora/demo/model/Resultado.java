package com.project.calculadora.demo.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resultado {

	private BigDecimal resultado;

}
