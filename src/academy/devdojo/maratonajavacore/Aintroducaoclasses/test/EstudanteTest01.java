package academy.devdojo.maratonajavacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajavacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
            Estudante estudante = new Estudante();
            Estudante estudante02 = new Estudante();

            estudante.nome = "Maria";
            estudante.idade = 22;
            estudante.sexo = 'M';
            estudante02.nome = "otavio";
            System.out.println(estudante.nome);
            System.out.println(estudante.idade);
            System.out.println(estudante.sexo);
            System.out.println(estudante02.nome);
    }
}
