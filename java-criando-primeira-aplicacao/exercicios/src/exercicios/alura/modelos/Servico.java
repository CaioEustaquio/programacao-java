package exercicios.alura.modelos;

public class Servico implements Vendavel{

    public double calcularPrecoTotal(double precoServico, int quantidade){

        double precoTotal = precoServico * quantidade;
        double imposto = 7;

        if(quantidade == 2){

            imposto = 5;
        }else if(quantidade == 4){

            imposto = 3;
        }else if(quantidade >= 10){

            imposto = 0;
        }

        precoTotal += ((imposto * precoTotal) / 100);

        return precoTotal;
    }
}
