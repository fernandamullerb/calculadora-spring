package br.com.calculadora.dto;
	
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoDto {
		
	@JsonProperty(value = "resultado")
	private BigDecimal resultado;
		
}
