package exercicios.alura.modelos;

public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco) {

        double valorImposto = ((15 * preco) / 100);

        return (valorImposto + preco);
    }
}
