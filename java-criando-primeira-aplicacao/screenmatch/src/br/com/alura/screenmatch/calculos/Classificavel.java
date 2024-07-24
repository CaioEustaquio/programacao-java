package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.models.Titulo;

public interface Classificavel {

    int getClassificacao();

    Titulo compareTo();
}