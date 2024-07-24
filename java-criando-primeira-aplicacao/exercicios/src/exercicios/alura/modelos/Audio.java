package exercicios.alura.modelos;

public class Audio{

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    public int getTotalCurtidas() {
        return this.totalCurtidas;
    }

    public int getClassificacao(){
        return this.classificacao;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void curtir(){
        this.totalCurtidas++;
    }
}
