package exercicios.alura.modelos;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public int calcularArea(int largura, int comprimento){

        return (largura * comprimento);
    }

    public int calcularPerimetro(int largura, int comprimento){

        return 2 * (largura + comprimento);
    }
}
