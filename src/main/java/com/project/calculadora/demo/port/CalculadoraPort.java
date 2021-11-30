package com.project.calculadora.demo.port;

import com.project.calculadora.demo.model.Calculadora;
import com.project.calculadora.demo.model.Resultado;

public interface CalculadoraPort {

    public Resultado soma(Calculadora calculadora);

    public Resultado multiplica(Calculadora calculadora);

    public Resultado divide(Calculadora calculadora);

    public Resultado subtrai(Calculadora calculadora);
}
