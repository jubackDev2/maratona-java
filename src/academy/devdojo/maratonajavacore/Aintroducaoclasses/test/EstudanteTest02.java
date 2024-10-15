package academy.devdojo.maratonajavacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajavacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
      Estudante estudante = new Estudante();
      Estudante estudante02 = new Estudante();
      estudante.nome = "Sandy";
      estudante02.nome = "marcia";

        System.out.println(estudante.nome);
        System.out.println(estudante02.nome);
    }
}
