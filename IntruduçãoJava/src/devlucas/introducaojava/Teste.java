package devlucas.introducaojava;

public class Teste {
    public static void main(String[] args){
        double valorCarro = 30000;
    for(int parcela = 0;parcela <= valorCarro; parcela++){
        double valorParcela = valorCarro/parcela;
        if (valorParcela < 1000){
            break;
        }
        System.out.println(parcela);

    }
    }



}



