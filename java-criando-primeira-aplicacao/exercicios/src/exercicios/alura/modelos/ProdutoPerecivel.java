package exercicios.alura.modelos;

public class ProdutoPerecivel extends ProdutoEx{

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade){

        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

}
