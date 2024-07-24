package exercicios.alura.modelos;

public class Produto implements Vendavel{

    @Override
    public double calcularPrecoTotal(double precoProduto, int quantidade) {

        double precoTotal = precoProduto * quantidade;
        double impostoPorLivro = 3;

        if(quantidade == 2){

            impostoPorLivro = 2;
        }else if(quantidade == 4){

            impostoPorLivro = 1.25;
        }else if(quantidade >= 6){

            impostoPorLivro = 0;
        }

        precoTotal += ((impostoPorLivro * precoTotal) / 100);

        return precoTotal;
    }
}
