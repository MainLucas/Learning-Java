package devlucas.introducaojava;

public class Aula08Arrays03 {
    public static void main(String[] args) {
        //Ensinando o <length> na linha 11;
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i <= nomes.length; i++) {   // length faz a contagem de quantos objetos tem no array
            System.out.println(nomes[i]);
        }

        for (int i = 0; i <=2 ; i++) {  // exemplo sem o length, tendo que colocar manualmente a quantidade.
            System.out.println(nomes[i]);
        }


    }
}
