import junit.framework.Assert;
import org.example.Main;
import org.example.Operacoes;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;


public class Maintest {
    @Test
    @DisplayName("Tudo ok.")
    public void testsomar(){
        Operacoes operacoestest = new Operacoes();

        float resultado = operacoestest.somar(2,3);

        Assertions.assertEquals(5, resultado);
    }
    @Test
    @DisplayName("Tudo ok.")
    public void testdivisao(){
        Operacoes operacoestest = new Operacoes();

        float resultado = operacoestest.dividir(10,2);

        Assertions.assertEquals(5, resultado);
    }
    @Test
    @DisplayName("Tudo ok.")
    public void testsubtrair(){
        Operacoes operacoestest = new Operacoes();

        float resultado = operacoestest.subtrair(10,3);

        Assertions.assertEquals(7, resultado);
    }
    @Test
    @DisplayName("Tudo ok.")
    public void testmultiplicar(){
        Operacoes operacoestest = new Operacoes();

        float resultado = operacoestest.multiplicar(7,7);

        Assertions.assertEquals(49, resultado);
    }
}
