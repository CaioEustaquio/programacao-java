import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        System.out.println(String.format("Duração do filme: %s", meuFilme.getDuracaoEmMinutos()));

        meuFilme.exibeFixaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Lost", 2000);
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);

        System.out.println(String.format("Duração da serie: %s", minhaSerie.getDuracaoEmMinutos()));
        System.out.println(String.format("Duração para maratonar Lost: %s", minhaSerie.getDuracaoEmMinutos()));

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclue((meuFilme));

        System.out.println(calculadora.getTempoTotal());

        calculadora.inclue((outroFilme));

        System.out.println(calculadora.getTempoTotal());

        calculadora.inclue((minhaSerie));

        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio() {
            @Override
            public Titulo compareTo() {
                return null;
            }
        };
        episodio.setNumero(2);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        // entre < e > informamos o que irá dentro da nossa lista
        ArrayList<Filme> listaFilmes = new ArrayList();

        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        listaFilmes.add(filmeDoPaulo);

        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).toString());



    }

}