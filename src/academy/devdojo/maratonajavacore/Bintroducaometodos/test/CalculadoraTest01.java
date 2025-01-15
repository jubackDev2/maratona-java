package academy.devdojo.maratonajavacore.Bintroducaometodos.test;

import academy.devdojo.maratonajavacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        System.out.println("finalizando CalculadoraTest01");
    }
}
