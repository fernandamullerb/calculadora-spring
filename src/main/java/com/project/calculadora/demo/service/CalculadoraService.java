package com.project.calculadora.demo.service;

import com.project.calculadora.demo.model.Resultado;
import com.project.calculadora.demo.port.CalculadoraPort;
import org.springframework.stereotype.Service;

import com.project.calculadora.demo.model.Calculadora;

import java.math.BigDecimal;

@Service
public class CalculadoraService implements CalculadoraPort {
	
	public Resultado soma(Calculadora calculadora) {
		BigDecimal soma = calculadora.getPrimeiroValor().add(calculadora.getSegundoValor());
		return Resultado.builder()
				.resultado(soma)
				.build();
	}

	public Resultado multiplica(Calculadora calculadora) {
		BigDecimal multiplicacao = calculadora.getPrimeiroValor().multiply(calculadora.getSegundoValor());
		return Resultado.builder()
				.resultado(multiplicacao)
				.build();
	}

	public Resultado divide(Calculadora calculadora) {
		BigDecimal divisao = calculadora.getPrimeiroValor().divide(calculadora.getSegundoValor());
		return Resultado.builder()
				.resultado(divisao)
				.build();
	}

	public Resultado subtrai(Calculadora calculadora) {
		BigDecimal subtracao = calculadora.getPrimeiroValor().subtract(calculadora.getSegundoValor());
		return Resultado.builder()
				.resultado(subtracao)
				.build();
	}

}