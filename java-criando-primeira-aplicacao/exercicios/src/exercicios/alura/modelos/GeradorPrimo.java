package exercicios.alura.modelos;
import exercicios.alura.modelos.VerificadorPrimo;

public class GeradorPrimo extends NumerosPrimos{

    // gera um número primo a partir do número passado no parâmetro
    public int gerarProximoPrimo(int numero){

        VerificadorPrimo verificador = new VerificadorPrimo();

        int proximo = numero + 1;

        boolean validacaoNumero = verificador.verificaNumeroPrimo(proximo);

        while(!validacaoNumero){
            proximo++;
            validacaoNumero = verificador.verificaNumeroPrimo(proximo);
        }

        return proximo;
    }
}
