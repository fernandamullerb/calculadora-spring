package com.project.calculadora.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.calculadora.demo.dto.CalculadoraDto;
import com.project.calculadora.demo.dto.ResultadoDto;
import com.project.calculadora.demo.service.CalculadoraService;

import static com.project.calculadora.demo.mapper.CalculadoraMapper.mapperCalculadora;

@RestController
@RequestMapping
public class CalculadoraController {
	
	@Autowired
	ModelMapper modelMapper;

	@Autowired
	CalculadoraService calculadoraService;
	
	@PostMapping("/soma")
	public ResultadoDto somar(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.soma(mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

	@PostMapping("/multiplicacao")
	public ResultadoDto multiplicacao(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.multiplica(mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

	@PostMapping("/divisao")
	public ResultadoDto divisao(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.divide(mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

	@PostMapping("/subtracao")
	public ResultadoDto subtracao(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.subtrai(mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

}
