package academy.devdojo.maratonajavacore.Bintroducaometodos.test;

import academy.devdojo.maratonajavacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado =  calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("-----------------");

       calculadora.imprimeDivisaoDeDoisNumeros(86, 0);



    }
}
