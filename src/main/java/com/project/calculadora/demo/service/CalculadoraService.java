package com.project.calculadora.demo.service;

import org.springframework.stereotype.Service;

import com.project.calculadora.demo.model.Calculadora;

@Service
public class CalculadoraService {
	
	public int soma(Calculadora calculadora) {
		
	return calculadora.getVar1() + calculadora.getVar2();
	}
	
	/*public String subtracao(int primeiroValor, int segundoValor) {
		return Integer.toString(primeiroValor - segundoValor);
	}
	
	public String mutiplicacao(int primeiroValor, int segundoValor) {
		return Double.toString(primeiroValor * segundoValor);
	}
	
	public String divisao(int primeiroValor, int segundoValor) {
		return Double.toString(primeiroValor / segundoValor);
	}*/
}