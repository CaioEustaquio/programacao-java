package exercicios.alura.modelos;

public class ConversorMoeda implements ConversaoFinanceira{

    public double converterDolarParaReal(double dolares){

        double taxaCambio = 5.43;

        return (dolares * taxaCambio);

    }
}
