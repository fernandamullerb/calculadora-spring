package com.project.calculadora.demo.model;
	
import com.fasterxml.jackson.annotation.JsonProperty;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public class ResultadoDto {
		
		@JsonProperty(value = "resultado")
		private int resultado;

		/*public ResultadoDto(int resultado) {
			this.resultado = resultado;
		}*/

		public int getResultado() {
			return resultado;
		}

		public void setResultado(int resultado) {
			this.resultado = resultado;
		}
		
}
