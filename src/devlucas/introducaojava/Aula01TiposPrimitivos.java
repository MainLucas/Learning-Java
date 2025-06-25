package devlucas.introducaojava;

public class Aula01TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos");
        System.out.println("Existem 8 tipos primitivos");
        System.out.println("boolean, char, int, float, double, short, byte, long,  ");

        int idade = 10;
        long numeroGrande = 1000000;
        double salarioDOuble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //pegou o valor da tabela unicode;

        System.out.println("A idade é " + idadeByte + " anos");
        System.out.println("char: " + caractere);

    }
}
