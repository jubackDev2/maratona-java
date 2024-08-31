package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {


        int number1 = 10;
        double number2 = 20;
        double resultado = number1 / number2;
        System.out.println(resultado);

        // %
        //operadores lógicos
        // <, >, <=, >=, ==, !=
        // And (&&), or ( || ),


        int numero = 3 % 2;
        System.out.println(numero);
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        double bonus = 1800;
        // bonus = bonus + 1000;
        bonus += 1000;
        bonus *=2;
        System.out.println(bonus);

        int contador = 5;
        contador++;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        System.out.println(--contador2);








    }
}
