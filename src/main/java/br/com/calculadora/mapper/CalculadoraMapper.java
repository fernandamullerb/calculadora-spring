package br.com.calculadora.mapper;

import br.com.calculadora.dto.CalculadoraDto;
import br.com.calculadora.model.Calculadora;

public class CalculadoraMapper {

	public static Calculadora mapperCalculadora(CalculadoraDto calculadoraDto) {

		return Calculadora.builder()
				.primeiroValor(calculadoraDto.getPrimeiroValor())
				.segundoValor(calculadoraDto.getSegundoValor())
				.build();
	}

}
