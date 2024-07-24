package br.com.alura.screenmatch.models;

public class Filme extends Titulo {

    private String diretor;

    public Filme(String nome, int anoLancamento) {

        super(nome, anoLancamento);
    }

    public String getDiretor(){
        return this.diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
