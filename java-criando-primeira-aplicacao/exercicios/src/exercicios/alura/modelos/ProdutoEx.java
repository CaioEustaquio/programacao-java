package exercicios.alura.modelos;

public class ProdutoEx{

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoEx(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){

        return String.format("Nome do produto: %s\nPreço: %s\nQuantidade: %s\n", this.getNome(), this.getPreco(), this.getQuantidade());
    };

}
