package academy.devdojo.maratonajavacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    // criei uma classe que tem a função para imprimir  estudantes.
    // como eu quero imprimir estudantes, eu vou precisar de uma variavel do tipo Estudantes. (isso no metodo)
        // tenha cuidado quando for importar a variavel Estudante, para não importar do pacote errado


        /*
         * importante:
         * quando voce passa objeto como argumento, voce na verdade está passando a  referencia, aonde aquele objeto está guardado
         *
         * */



        public void imprime (Estudante estudante){



        System.out.println("--------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }
}
