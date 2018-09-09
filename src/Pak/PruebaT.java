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
    @Test
    public void ConvercionCF() {
        esperado = 37.4;
        assertEquals(esperado, Meto.CelsiusFahrenheit(3), 0);
    }
    @Test
    public void ConvercionCK(){
        esperado = 275;
        assertEquals(esperado,Meto.CelsiusKelvin(2),0);
    }
    @Test
    public void ConvercionKC(){
        esperado = -271;
        assertEquals(esperado,Meto.KelvinCelsuis(2),0);
    }

}
