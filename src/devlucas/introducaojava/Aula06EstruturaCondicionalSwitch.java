package devlucas.introducaojava;

public class Aula06EstruturaCondicionalSwitch {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo.
        //Esse seria o método mais díficil por isso utilizaremos o switch para facilitar em casos como esse.
        byte dia = 5;
        if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda-feira");
        }
        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("Utilizando o switch é mais rapido, veja a seguir!");
        //Utilizando o switch é mais rapido, veja a seguir:

        byte dia1 = 10;
        // apenas esses valores em switch;
        //char, int, byte, short, enum, String
        switch (dia1){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("opção inválida");
                break;

        }


    }
}
