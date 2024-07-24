package exercicios.alura.modelos;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero){

        for(int i = 1;i <= 10;i++){

            System.out.println(String.format("%s x %s = %s", numero, i, (numero*i)));
        }
    }
}
