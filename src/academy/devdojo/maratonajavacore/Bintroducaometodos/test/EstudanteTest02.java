package academy.devdojo.maratonajavacore.Bintroducaometodos.test;

import academy.devdojo.maratonajavacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante01.nome = "Ana";
        estudante01.idade = 22;
        estudante01.sexo = 'F';

        estudante02.nome = "Marcos";
        estudante02.idade = 17;
        estudante02.sexo = 'M';
    }
}
