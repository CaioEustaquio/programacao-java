import java.util.Scanner;

public class Desafio {

    public static void main(String[] args){

        System.out.println("*******************************************");
        System.out.println("Dados iniciais do cliente:\n");

        String cliente = "Caio Alves Eustáquio";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcaoSelecionada;
        boolean sistemaEncerrado = false;

        System.out.println(String.format("""
        Nome:               %s
        Tipo conta:         %s
        Saldo inicial       R$ %s
        """, cliente, tipoConta, saldo));

        System.out.println("*******************************************\n\n");

        Scanner leitura = new Scanner(System.in);

        while(sistemaEncerrado == false){

            System.out.println("""
            Operações\n
            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair\n
            Digite a opção desejada:
            """
            );

            opcaoSelecionada = leitura.nextInt();

            if(opcaoSelecionada == 1){

                System.out.println(String.format("O saldo atual é R$ %s\n", saldo));
            }else if(opcaoSelecionada == 2){
                System.out.println("Informe o valor  a receber:");
                double valorReceber = leitura.nextDouble();

                saldo += valorReceber;
                System.out.println(String.format("Saldo atualizado R$ %s\n", saldo));

            }else if(opcaoSelecionada == 3){
                System.out.println("Informe o valor que deseja transferir:");
                double valorTransferir = leitura.nextDouble();

                if(valorTransferir > saldo){
                    System.out.println("Não há saldo  suficiente para fazer  essa transferência");
                }else{
                    saldo -= valorTransferir;
                    System.out.println(String.format("Saldo atualizado R$ %s\n", saldo));
                }

            }else if(opcaoSelecionada == 4){
                sistemaEncerrado = true;
                break;
            }else{
                System.out.println("Opção inválida\n");
            }
        }
    }
}
