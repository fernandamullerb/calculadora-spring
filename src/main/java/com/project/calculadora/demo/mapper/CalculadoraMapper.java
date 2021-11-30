package com.project.calculadora.demo.mapper;

import com.project.calculadora.demo.model.Calculadora;
import com.project.calculadora.demo.dto.CalculadoraDto;

public class CalculadoraMapper {

	public static Calculadora mapperCalculadora(CalculadoraDto calculadoraDto) {

		return Calculadora.builder()
				.primeiroValor(calculadoraDto.getPrimeiroValor())
				.segundoValor(calculadoraDto.getSegundoValor())
				.build();
	}

}
