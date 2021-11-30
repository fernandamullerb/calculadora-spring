package br.com.calculadora.service;

import br.com.calculadora.model.Calculadora;
import br.com.calculadora.model.Resultado;
import br.com.calculadora.port.CalculadoraPort;
import br.com.calculadora.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculadoraService implements CalculadoraPort {

	@Autowired
	ResultadoRepository resultadoRepository;
	
	public Resultado soma(Calculadora calculadora) {
		BigDecimal soma = calculadora.getPrimeiroValor().add(calculadora.getSegundoValor());
		Resultado resultado = Resultado.builder().resultado(soma).build();
		resultadoRepository.save(resultado);
		return resultado;
	}

	public Resultado multiplica(Calculadora calculadora) {
		BigDecimal multiplicacao = calculadora.getPrimeiroValor().multiply(calculadora.getSegundoValor());
		Resultado resultado = Resultado.builder().resultado(multiplicacao).build();
		resultadoRepository.save(resultado);
		return resultado;
	}

	public Resultado divide(Calculadora calculadora) {
		BigDecimal divisao = calculadora.getPrimeiroValor().divide(calculadora.getSegundoValor(), RoundingMode.CEILING);
		Resultado resultado = Resultado.builder().resultado(divisao).build();
		resultadoRepository.save(resultado);
		return resultado;
	}

	public Resultado subtrai(Calculadora calculadora) {
		BigDecimal subtracao = calculadora.getPrimeiroValor().subtract(calculadora.getSegundoValor());
		Resultado resultado = Resultado.builder().resultado(subtracao).build();
		resultadoRepository.save(resultado);
		return resultado;
	}

}