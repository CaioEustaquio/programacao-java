package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo implements Classificavel, Comparable<Titulo>{

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento){
        this.setNome(nome);
        this.setAnoLancamento(anoLancamento);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoLancamento(){
        return this.anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return this.incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos(){
        return this.duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalAvaliacoes(){
        return this.totalAvaliacoes;
    }

    public void exibeFixaTecnica(){
        System.out.println(String.format("Nome do filme: %s", this.nome));
        System.out.println(String.format("Ano de lançamento: %s", this.anoLancamento));
    }

    public void avalia(double nota){
        this.somaAvaliacoes += nota;
        this.totalAvaliacoes++;
    }

    public double pegaMedia(){
        return (double) this.somaAvaliacoes / this.totalAvaliacoes;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    @Override
    public Titulo compareTo() {
        return this;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
