package br.com.alura.screenmatch.models;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas(){
        return this.temporadas;
    }
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada(){
        return this.episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean getAtiva(){
        return this.ativa;
    }
    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio(){
        return this.minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // O Override informa que o método a seguir será uma reescrita de um método que já existe na classe mãe (superclasse)
    @Override
    public int getDuracaoEmMinutos(){
        return this.temporadas * this.episodiosPorTemporada * this.minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
