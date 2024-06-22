package devlucas.introducaojava;

public class Aula08Arrays04ForEach {
    public static void main(String[] args) {
        // uma forma de adicionar objetos ao array
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        // outra forma de adionar objetos ao array
        int[] numeros2 = {1, 2, 3 ,4 ,5};
        int[] numeros3 = {1,10,23,50,50};
        // Uma forma para imprimir um valor expecifico ou até mesmo todo
        for (int i = 0; i < numeros2.length ; i++) {
            System.out.println(numeros2[i]);
        }
        //for each é usado para percorrer todos, é um for mais simplificado.
        //Outra forma para imprimir atráves do ForEach; básicamente ele vai percorrer por todos os objetos no array
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
