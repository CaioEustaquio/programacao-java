public class Main{
    public static void main(String[] args){

        System.out.println("Esse é o Screen Match");
        System.out.println("Top Gun: Maverick");

        // tipos primitivos de variáveis
        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double nota = 8.1;
        String nomeFilme = "Top Gun: Maverick";


        double media = (9.8 + 6.3 + 8.0) / 3;
        String sinopse = String.format("Filme: %s. Filme de aventura com galã dos anos 80 muito bom! Ano de lançamento: %s", nomeFilme, anoLancamento);

        System.out.println(sinopse);

        int classificacao = (int) media / 2;

        System.out.println(classificacao);

    }
}