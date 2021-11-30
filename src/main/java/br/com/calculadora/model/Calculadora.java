package br.com.calculadora.model;

import br.com.calculadora.dto.CalculadoraDto;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder  
@NoArgsConstructor  
@AllArgsConstructor 
public class Calculadora {

	private BigDecimal primeiroValor;
	private BigDecimal segundoValor;

	public Calculadora(CalculadoraDto calculadoraDto) {
		this.primeiroValor = calculadoraDto.getPrimeiroValor();
		this.segundoValor = calculadoraDto.getSegundoValor();
	}

}
