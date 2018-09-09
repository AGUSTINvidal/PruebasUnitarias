package Pak;

import javax.swing.JOptionPane;

public class Temp {

    public double FahrenheitCelsius(double grado) {
        //=(grado-32)/1.8;
        double gCelsius = (grado - 32) * 5 / 9;
        return gCelsius;
    }

    double CelsiusFahrenheit(double grado) {
        double gFahrenheit = (grado * 9 / 5) + 32;
        return gFahrenheit;
    }

    double CelsiusKelvin(double grado) {
        double gKelvin = (grado) + 273;
        return gKelvin;
    }

    double KelvinCelsuis(double grado) {
        double gKCelsuis = grado - 273;
        return gKCelsuis;
    }

    double FahrenheitKelvin(double grado) {
        double gFkevin = (grado - 32) * 5 / 9 + 273;
        return gFkevin;
    }

    double KelvinFahrenheit(double grado) {
        double gKfahrenheit = (grado - 273) * 9 / 5 + 32;
        return gKfahrenheit;
    }

    public static void main(String[] args) {
        double grado = 0, gCelsius = 0, gFahrenheit = 0, gKelvin = 0, gKCelsuis = 0, gFkevin = 0, gKfahrenheit = 0;
        Temp temp = new Temp();

        int opcion = 0;
        String cadena;
        do {
            cadena = JOptionPane.showInputDialog("\n [1] Convertir Fahrenheit - Celsius \n [2] Convertir Celsius - Fahrenheit " +
                    "\n [3] Convertir Celsius - kelvin \n [4] Convertir Kelvin - celsius \n [5] Convertir Fahrenheit - kevin " +
                    "\n [6] Convertir Kelvin - fahrenheit \n [0] para salir");
            opcion = Integer.parseInt(cadena);
            if (opcion != 0) {

                cadena = JOptionPane.showInputDialog("Ingrese la temperatura: ");
                grado = Double.parseDouble(cadena);
                switch (opcion) {

                    case 1: {
                        gCelsius = temp.FahrenheitCelsius(grado);
                        JOptionPane.showMessageDialog(null, " TEMPERATURA: " + gCelsius + " Celsius");

                    }
                    ;
                    break;

                    case 2: {
                        gFahrenheit = temp.CelsiusFahrenheit(grado);
                        JOptionPane.showMessageDialog(null, " TEMPERATURA: " + gFahrenheit + " Fahrenheit");
                    }
                    ;
                    break;


                    case 3: {
                        gKelvin = temp.CelsiusKelvin(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gKelvin + " Kelvin");
                    }
                    ;
                    break;
                    case 4: {
                        gKCelsuis = temp.KelvinCelsuis(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gKCelsuis + " Celsuis");
                    }
                    ;
                    break;
                    case 5: {
                        gFkevin = temp.FahrenheitKelvin(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gFkevin + " Kelvin");
                    }
                    ;
                    break;
                    case 6: {
                        gKfahrenheit = temp.KelvinFahrenheit(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gKfahrenheit + " Fahrenheit");
                    }
                    ;
                    break;
                }
            }
        } while (opcion > 0);


    }
}
