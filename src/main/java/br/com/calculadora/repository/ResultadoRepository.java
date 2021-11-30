package br.com.calculadora.repository;

import br.com.calculadora.model.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultadoRepository extends JpaRepository<Resultado, Long> {

}
