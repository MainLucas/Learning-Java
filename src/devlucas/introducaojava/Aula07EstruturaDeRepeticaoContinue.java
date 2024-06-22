package devlucas.introducaojava;

public class Aula07EstruturaDeRepeticaoContinue {
    public static void main(String[] args) {
        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado;
        //Condição ValorParcela >= 1000

        double valorCarro = 30000;
        for (int parcela = (int)valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
