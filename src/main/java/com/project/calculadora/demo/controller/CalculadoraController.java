package com.project.calculadora.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.calculadora.demo.model.Calculadora;
import com.project.calculadora.demo.model.CalculadoraDto;
import com.project.calculadora.demo.model.ResultadoDto;
import com.project.calculadora.demo.service.CalculadoraService;

@RestController
public class CalculadoraController {
	
	@Autowired(required=true)
	ModelMapper modelMapper;

	@Autowired
	CalculadoraService calculadoraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResultadoDto calcular(@RequestBody CalculadoraDto calculadoraDto) {
		
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.soma(modelMapper.map(calculadoraDto, 
				Calculadora.class)), ResultadoDto.class);		
		
		return resultadoDto;
	}

}
