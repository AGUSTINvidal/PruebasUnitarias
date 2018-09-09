package Pak;

//import org.junit.Test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PruebaT {
    double esperado;
    double resultado;


    Temp Meto = new Temp();


    @Test
    public void ConvercionFC() {
        esperado = -16.666666666666668;
        assertEquals(esperado, Meto.FahrenheitCelsius(2), 0);
    }


}
