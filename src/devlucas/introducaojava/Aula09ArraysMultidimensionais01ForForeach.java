package devlucas.introducaojava;

public class Aula09ArraysMultidimensionais01ForForeach {
    public static void main(String[] args) {
        // 1,2,3,4 e 5 meses
        // 31, 28, 31 e 30 dias

        int [][] dias = new int[3][3];

        dias[0][0] = 2;
        dias[0][1] = 2;
        dias[0][2] = 2;

        dias[1][0] = 1;
        dias[1][1] = 1;
        dias[1][2] = 1;

        dias[2][0] = 3;
        dias[2][1] = 3;
        dias[2][2] = 3;

        //imprimir valores com for
        for(int i = 0; i < dias.length; i++){ // ele entra no primeiro objeto e depois vai para o proximo for
            for(int j = 0; j < dias[i].length; j++){  // aqui ele percorre a todos objetos para retornar e ir para o proximo
                System.out.println(dias[i][j]); // imprimindo os valores.
            }
        }
        System.out.println("====================================================================================");
        System.out.println("====================================================================================");
        //imprimir valores com o ForEach
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
