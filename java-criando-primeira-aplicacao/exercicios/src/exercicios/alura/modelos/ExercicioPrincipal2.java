package exercicios.alura.modelos;

import java.util.ArrayList;

public class ExercicioPrincipal2{

    public static void main(String[] args){

        ArrayList<Pessoa> listaDePessoas = new ArrayList();

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa.setNome("Caio Alves Eustáquio");
        pessoa.setIdade(24);
        pessoa1.setNome("Giovanna Baptista Junges");
        pessoa1.setIdade(21);
        pessoa2.setNome("Beatriz Pilla Cambraia");
        pessoa2.setIdade(21);

        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista completa: " + listaDePessoas);
    }
}
