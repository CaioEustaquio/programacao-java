package exercicios.alura.modelos;

public class Carro {
    private String modelo;
    private double[] precos = new double[3];

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precos[0] = precoAno1;
        this.precos[1] = precoAno2;
        this.precos[2] = precoAno3;
    }

    public double getPrecos(String s){

        double valor = this.precos[0];

        if(s == "menor"){

            for(double preco : precos) {
                if (preco < valor) {
                    valor = preco;
                }
            }
        }else if(s == "maior"){

            for (double preco : precos) {
                if (preco > valor) {
                    valor = preco;
                }
            }
        }

        return valor;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Modelo: " + modelo);
        System.out.println("Preços nos três anos: ");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Ano " + (i + 1) + ": " + precos[i]);
        }
        System.out.println("Menor preço: " + getPrecos("menor"));
        System.out.println("Maior preço: " + getPrecos("maior"));
    }
}