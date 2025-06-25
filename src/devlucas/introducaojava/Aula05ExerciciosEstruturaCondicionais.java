package devlucas.introducaojava;

public class Aula05ExerciciosEstruturaCondicionais {
    public static void main(String[] args) {
        /* com base as taxes da netherlands 2020, faça uma estrutura condicional para saber quanto será a taxa de um
        determinado salário.
         */
        double salario = 70000;
        double valor1 = (salario * 9.70) / 100;
        double valor2 = (salario * 37.35) / 100;
        double valor3 = (salario * 49.50) / 100;

        if (salario <= 34712) {
            System.out.printf("Sua taxa anual é de 9.70%% ao ano, valor de: %.2f ", valor2);
        } else if (salario > 34713 && salario <= 66507) {
            System.out.printf("Sua taxa anual é de 37.35%% ao ano, valor de: %.2f ", valor2);
        } else {
            System.out.printf("Sua taxa anual é de 49.50%% ao ano, valor de: %.2f ", valor3);
        }
    }
}
