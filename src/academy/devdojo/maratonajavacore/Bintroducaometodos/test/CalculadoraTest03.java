package academy.devdojo.maratonajavacore.Bintroducaometodos.test;

import academy.devdojo.maratonajavacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2); // pode ser feito assim
        calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros(20, 2)); // e também pode nao usar variaveis, para retornar o valor
    }
}
