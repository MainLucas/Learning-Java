package devlucas.introducaojava;

public class Aula06EstruturaCondicionalSwitchExercicio {
    public static void main(String[] args) {
        //dados os valores de 1 a 7, imprimima se é dia útil ou final de semana
        //considerando 1 como domingo

        short dia = 4;
        // essa opção foi mais prática utilizando uma função do java.
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");

        }
        switch (dia) {
            case 1:
                System.out.println();
                break;
        }


    }
}
