    package academy.devdojo.maratonajavacore.Bintroducaometodos.test;

    import academy.devdojo.maratonajavacore.Bintroducaometodos.dominio.Estudante;
    import academy.devdojo.maratonajavacore.Bintroducaometodos.dominio.ImpressoraEstudante;

    public class EstudanteTest01 {

        public static void main(String[] args) {
            Estudante estudante01 = new Estudante();
            Estudante estudante02 = new Estudante();
            ImpressoraEstudante impressora = new ImpressoraEstudante();

            estudante01.nome = "Ana";
            estudante01.idade = 22;
            estudante01.sexo = 'F';

            estudante02.nome = "Marcos";
            estudante02.idade = 17;
            estudante02.sexo = 'M';



              impressora.imprime(estudante01);
              impressora.imprime(estudante02);
            System.out.println("############");
            impressora.imprime(estudante01);
            impressora.imprime(estudante02);














        }
    }
