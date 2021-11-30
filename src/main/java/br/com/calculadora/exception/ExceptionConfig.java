package br.com.calculadora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseEntity<Object> exception(HttpMessageNotReadableException exception) {
        return new ResponseEntity<>("Digite uma entrada válida.", HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity<Object> exception(ArithmeticException exception) {
        return new ResponseEntity<>("Operação inválida.", HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(value = SQLException.class)
    public ResponseEntity<Object> exception(SQLException exception) {
        return new ResponseEntity<>("Erro ao salvar o resultado no banco de dados.", HttpStatus.UNPROCESSABLE_ENTITY);
    }

}
