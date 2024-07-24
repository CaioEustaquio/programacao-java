import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args){

        System.out.println("Bem vindo ao jogo da adivinhação");
        System.out.println("Você tem 5 tentativas para acertar o número secreto.");
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 1;
        int chute = 0;
        Scanner leitura = new Scanner(System.in);

        while(numeroTentativas < 5){

            System.out.println("Digite um número entre 0 e 100");
            chute = leitura.nextInt();

            if(chute == numeroAleatorio){

                System.out.println(String.format("Parabéns você acertou o número secreto com %s tentativas", numeroTentativas));
                break;
            }else{
                if(chute > numeroAleatorio){

                    System.out.println("O número secreto é menor");
                }else{

                    System.out.println("O número secreto é maior");
                }

                numeroTentativas++;
            }
        }

        if (numeroTentativas == 5 && chute != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número secreto era: " + numeroAleatorio);
        }
    }
}
