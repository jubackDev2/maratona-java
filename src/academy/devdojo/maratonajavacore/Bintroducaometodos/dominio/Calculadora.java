package academy.devdojo.maratonajavacore.Bintroducaometodos.dominio;

public class Calculadora {

    // a primeira parte de um metodo sempre vai ser um modificador de acesso -> public
    // a seggunda parte é o retorno, o metodo ele retorna alguma coisa ou nao retorna nada.

     /*
      vamos começar com o fato de não retornar nada: void e em seguida nos temos o nome do metodo

      importante: se voce tem um metodo com mais de 3 argumentos, significa seu metodo está fazendo muita coisa.. não é uma boa pratica
      */

    public void somaDoisNumeros(){
        System.out.println(10+10);

    }

    public void subraiDoisNumeros (){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){ // parametros nada mais é que variaveis locais
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
         return num1/num2;
    }
}
