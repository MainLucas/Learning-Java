package devlucas.introducaojava;

public class Aula07EstruturaDeRepeticaoExercicios02 {
    public static void main(String[] args) {
        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado;
        //Condição ValorParcela >= 1000

        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
