package academy.devdojo.maratonajavacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajavacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Antonia";
        professor.sexo = 'M';
        professor.idade = 55;
        System.out.println(professor.nome + " "+ professor.idade+ " "+ professor.sexo );

    }
}
