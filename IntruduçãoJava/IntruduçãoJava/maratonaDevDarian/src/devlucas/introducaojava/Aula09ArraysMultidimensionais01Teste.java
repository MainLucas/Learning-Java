package devlucas.introducaojava;

public class Aula09ArraysMultidimensionais01Teste {
    public static void main(String[] args) {
      int [][] dias = new int[3][3];

      dias [0][0] = 7;
      dias [0][1] = 7;
      dias [0][2] = 7;

      dias [1][0] = 2;
      dias [1][1] = 2;
      dias [1][2] = 2;

      dias [2][0] = 3;
      dias [2][1] = 3;
      dias [2][2] = 3;

      //imprimindo valores do array.
       for (int i = 0;i < dias.length;i++){
           for(int j = 0;j < dias[i].length;j++){
               System.out.println(dias[i][j]);
           }
       }

    }
}
