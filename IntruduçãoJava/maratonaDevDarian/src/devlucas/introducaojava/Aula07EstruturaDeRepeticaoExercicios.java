package devlucas.introducaojava;

public class Aula07EstruturaDeRepeticaoExercicios {
    public static void main(String[] args) {
        //imprima os primeiros 25 numeros de um dado valor. por exemplo, 50.
        // inicializar em 0; condição ; então acrescente
        int valorMax = 50;
        for (int i = 0;i <= valorMax; i++){
            if (i > 25){        //Necessário acrescentar o if
                break;
            }
            System.out.println(i);
        }
    }
}
