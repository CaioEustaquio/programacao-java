package exercicios.alura.modelos;

public class Livro implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco){

        double valorImposto = ((7 * preco) / 100);

        return (valorImposto + preco);
    }
}
