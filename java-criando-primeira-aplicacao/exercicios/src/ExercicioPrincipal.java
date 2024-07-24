import exercicios.alura.modelos.*;

import java.util.ArrayList;

public class ExercicioPrincipal {

    public static void main(String[] args){

        ConversorMoeda convercaoMoeda = new ConversorMoeda();

        System.out.println(convercaoMoeda.converterDolarParaReal(59));

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        System.out.println(calculadora.calcularArea(25, 50));
        System.out.println(calculadora.calcularPerimetro(30, 30));

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(88);

        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celsiusParaFahrenheit(12);
        conversorTemperatura.fahrenheitParaCelsius(53);

        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();

        System.out.println(livro.calcularPrecoFinal(80.59));
        System.out.println(produtoFisico.calcularPrecoFinal(249.90));

        Servico servico = new Servico();
        Produto produto = new Produto();

        System.out.println(servico.calcularPrecoTotal(1500, 10));
        System.out.println(servico.calcularPrecoTotal(39.90, 6) + "\n\n");

        ArrayList<ProdutoEx> listaProdutos = new ArrayList();

        ProdutoEx produto1 = new ProdutoPerecivel("Queijo", 26.90, 358, "2024-10-22");
        ProdutoEx produto2 = new ProdutoPerecivel("Água", 3.90, 1060, "2026-02-06");
        ProdutoEx produto3 = new ProdutoPerecivel("Maçã Fuji", 14.00, 900, "2024-10-22");

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println(String.format("Tamanho da lista: %s",listaProdutos.size()));
        System.out.println(String.format("Produto 3: %s\n", listaProdutos.get(2).getNome()));

        for(int i=0; i < listaProdutos.size();i++){

            System.out.println(listaProdutos.get(i).toString());
        }
    }
}
