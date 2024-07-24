public class ExsModuloJava2 {

    public static void main(String[] args){

        // 1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado.

            double n1 = 7;
            double n2 = 5.5;
            double media = ((n1 + n2) / 2);

            System.out.println(String.format("Média: %s", media));

        // 2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

            double num1 = 50.55;
            int num2 = 10;

            int castingInt = (int) num1;
            double castingDouble = (double) num2;

            System.out.println("Casting de double para inteiro " + castingInt);
            System.out.println("Casting de int para double " + castingDouble);

        // 3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

            char letra = 'C';
            String frase = "Meu nome é Caio e meu nome começa com a letra";

            System.out.println(frase + " " + letra + ".");

        // 4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

            double precoProduto = 1289.90;
            int qtd = 1;

            double valorTotal = precoProduto * qtd;

            System.out.println("O valor total é: " + valorTotal);


        // 5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

            double valorEmdolares = 250.00;
            double convercaoEmReal = valorEmdolares * 4.94;

            System.out.println("O valor convertido de dólar para real é: " + convercaoEmReal);

        // 6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

            double precoOriginal = 4000.00;
            double percentualDesconto = 10.00;

            double valorDesconto = (precoOriginal * percentualDesconto) / 100;
            double precoFinal = precoOriginal - valorDesconto;

            System.out.println("Valor do produto com desconto: " + precoFinal);

    }
}
