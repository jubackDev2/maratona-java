package academy.devdojo.maratonajavacore.Bintroducaometodos.test;

import academy.devdojo.maratonajavacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       int num1 = 1;
       int num2 = 2;

       calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("dentro calculadoraTeste04");
        System.out.println("Num1 "+num1 );
        System.out.println("Num2 "+num2);


    }
}
