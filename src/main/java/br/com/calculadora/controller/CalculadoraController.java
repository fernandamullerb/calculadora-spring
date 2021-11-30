package br.com.calculadora.controller;

import br.com.calculadora.dto.CalculadoraDto;
import br.com.calculadora.dto.ResultadoDto;
import br.com.calculadora.mapper.CalculadoraMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.calculadora.service.CalculadoraService;

@RestController
public class CalculadoraController {
	
	@Autowired
	ModelMapper modelMapper;

	@Autowired
	CalculadoraService calculadoraService;
	
	@PostMapping("/soma")
	public ResultadoDto soma(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.soma(CalculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

	@PostMapping("/multiplicacao")
	public ResultadoDto multiplicacao(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.multiplica(CalculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

	@PostMapping("/divisao")
	public ResultadoDto divisao(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.divide(CalculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

	@PostMapping("/subtracao")
	public ResultadoDto subtracao(@RequestBody CalculadoraDto calculadoraDto) {
		ResultadoDto resultadoDto = modelMapper.map(calculadoraService.subtrai(CalculadoraMapper.mapperCalculadora(calculadoraDto)), ResultadoDto.class);
		return resultadoDto;
	}

}
