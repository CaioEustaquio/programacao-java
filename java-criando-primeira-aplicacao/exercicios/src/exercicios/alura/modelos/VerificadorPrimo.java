package exercicios.alura.modelos;

public class VerificadorPrimo extends NumerosPrimos{

    public boolean verificaNumeroPrimo(int numero){

        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            return false;
        }

        // Verifica se o número é divisível por qualquer número de 2 até a raiz quadrada de numero
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisível, não é primo
            }
        }

        return true;
    }
}
