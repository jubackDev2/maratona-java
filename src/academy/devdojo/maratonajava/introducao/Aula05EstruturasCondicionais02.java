package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // QUANDO TEMOS MAIS DE UMA CONDIÇÃO USAMOS ELSE IF

        // se a idade for < 15 (imprima na tela categoria infantil)
        //se a idade for >= 15 && idade < 18 categoria juvenil
        //se a idade for >= 18 categoria adulto



        int idade = 15;
        String categoria;

        if (idade < 15) {
            categoria = "INFANTIL";
        } else if (idade >= 15 && idade < 18) {
            categoria = "JUVENIL";
        }else {
            categoria = "ADULTO";
        }

        System.out.println(categoria);

    }
}
