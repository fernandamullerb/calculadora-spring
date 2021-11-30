package br.com.calculadora.port;

import br.com.calculadora.model.Calculadora;
import br.com.calculadora.model.Resultado;

public interface CalculadoraPort {

    public Resultado soma(Calculadora calculadora);

    public Resultado multiplica(Calculadora calculadora);

    public Resultado divide(Calculadora calculadora);

    public Resultado subtrai(Calculadora calculadora);

}
