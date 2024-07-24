package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo{

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void inclue(Titulo t){
        System.out.println(String.format("Adicionando duração em minutos de %s", t));
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
//    public void inclue(Serie s){
//
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
}
