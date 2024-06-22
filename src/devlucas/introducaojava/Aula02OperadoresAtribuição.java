package devlucas.introducaojava;

public class Aula02OperadoresAtribuição {
    public static void main(String[] args) {
        // =, += -=, *=, /=, %=

        // forma para dar um novo valor a mesma váriavel;
        double bonus = 1800;
        bonus += bonus + 1000;
        bonus *= 2;
        bonus -= 100;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;  // contadoor = contador + 1
        contador++;
        contador--;
        ++contador;// serve para primeiro incrementar o valor antes de fazer a leitura.
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println("Teste");
        System.out.println(++contador2); /* aqui ele incrementa um valor antes
                                           de fazer a leitura*/
    }
}