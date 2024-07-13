package devlucas.introducaojava;

public class Aula04OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String mesagemDoar = "Eu vou doar 500 pro DevDojo";
        String mesagemNaoDoar = "Ainda não tenho condições, mas vou ter! ";
        String resultado;
        //UTILIZANDO ESTRUTURA SIMPLES DE IF E ELSE;
        if(salario > 5000){
            resultado = mesagemDoar;
        }
        else{
            resultado = mesagemNaoDoar;
        }
        System.out.println(resultado);

        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("Operador ternário só é usado em estrutura condicional simples.");

        //UTILIZANDO OPERADOR TERNÁRIO PARA IF E ELSE sempre para simples;
        // = significa <se> // ? significa <então>// : significa <se não>;
        resultado = salario > 5000 ? mesagemDoar : mesagemNaoDoar;
        System.out.println(resultado);

        resultado = salario < 5000 ? mesagemDoar : mesagemNaoDoar;
        System.out.println(resultado);
    }
}
