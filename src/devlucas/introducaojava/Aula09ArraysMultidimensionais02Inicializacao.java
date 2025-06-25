package devlucas.introducaojava;

public class Aula09ArraysMultidimensionais02Inicializacao {
    public static void main(String[] args) {
        //           valor uma referência com 03 valores //  indica 03 valores;
        int[][] arrayInt = new int[1][3];
        arrayInt[0][0] = 1;
        arrayInt[0][1] = 1;
        arrayInt[0][2] = 1;
        // variaveis de referência sempre iniciam com o valor null se você não der nenhum valor;
        for (int[] arrayBase : arrayInt) {
            System.out.println("\n -----");
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
        // AQUI É UMA FORMA DE FAZER UMA REFERÊNCIA COM VALORES DIFERENTES UMA DA OUTRA.
        // Escolhendo quantas referências tem e quantos valores no array
        //                   Aqui ele criou 03 referências;
        int[][] array2 = new int[3][];
        //adicionando quantas variáveis do tipo int vai ter essa refência
        array2[0] = new int[2];   // Tem 02 valores do tipo int;
        array2[1] = new int[3];   // Tem 03 valores do tipo int;
        array2[2] = new int[6];   // Tem 06 valores do tipo int;

        System.out.println("========/////////////////////===========");
        System.out.println("========/////////////////////===========");
        // criando ou ADICIONANDO VALORES AO ARRAY DE FORMA DIRETA;

        int[][] array03 = {{0, 0}, {0,1,2}, {1, 2, 3, 4, 5, 6}};
        for(int[] arrayBasee:array03){
            System.out.println("\n---");
            for(int num:arrayBasee){
                System.out.println(num);
            }
        }

    }
}
