package devlucas.introducaojava;

public class Aula07EstruturaDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;
        while (contador < 10) {    //precisa ser um resultado booleano
            System.out.println(contador); // se apenas deixarmos assim, ele vai ficar repetindo 0 eternamente
            contador += 1; // agora teremos o 1 adicionado a cada repetição, fazendo sair do 0;

            // System.out.println(++contador); temos essa opção também, quase esquecida por mim..
        }
        //outra estrutura de repetição é do while
        //A diferença é que ela vai executar pelo menos uma vez mesmo que seja falso
        do {
            System.out.println("dentro do do-while");
        } while (contador < 10);

        // for
        for (int i = 0 ;i<10 ; i++ ){// for sempre é dividido em três partes.
            System.out.println("for " + i);
        }
    }
}
