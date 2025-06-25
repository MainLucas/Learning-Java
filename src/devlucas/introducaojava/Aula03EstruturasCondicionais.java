package devlucas.introducaojava;

public class Aula03EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 15;
        String categoria;
        //!operador de negação.
        if (age >= 18) {
            System.out.println("Autorizado a comprar bebida Alcólica");
        // Testando váriavel
        }

        if (age <15){
            categoria = "Categoria Juvenil";
        }else if (age >= 15 && age < 18){
            categoria = "Categoria Infantil";
        }
        else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
