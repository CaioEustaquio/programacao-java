import exercicios.alura.modelos.MinhasPreferidas;
import exercicios.alura.modelos.Musica;
import exercicios.alura.modelos.Podcast;

public class DesafioAudioPrincilal{

    public static void main(String[] args){

        Musica musica = new Musica();
        musica.setTitulo("Mezmerizer");
        musica.setArtista("Hatsune Miku Kasane Teto");

        for(int i= 0;i < 268; i++){
            musica.reproduzir();
        }

        for(int i= 0;i < 30; i++){
            musica.curtir();
        }

        System.out.println(musica.getTotalCurtidas());
        System.out.println(musica.getTotalReproducoes());

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setHost("Marcos Mendes");

        for(int i= 0;i < 1084; i++){
            meuPodcast.reproduzir();
        }

        for(int i= 0;i < 687; i++){
            meuPodcast.curtir();
        }

        MinhasPreferidas mp = new MinhasPreferidas();
        mp.inclui(musica);
        mp.inclui(meuPodcast);

    }
}
