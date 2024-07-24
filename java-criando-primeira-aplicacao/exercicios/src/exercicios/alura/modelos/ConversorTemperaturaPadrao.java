package exercicios.alura.modelos;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(int celsius){

        System.out.println(celsius * 9/5 + 32);

    }

    @Override
    public void fahrenheitParaCelsius(int fahrenheit){

        System.out.println((fahrenheit - 32) * 5/9);
    }
}