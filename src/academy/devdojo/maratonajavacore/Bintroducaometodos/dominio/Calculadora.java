package academy.devdojo.maratonajavacore.Bintroducaometodos.dominio;

public class Calculadora {

    // a primeira parte de um metodo sempre vai ser um modificador de acesso -> public
    // a seggunda parte é o retorno, o metodo ele retorna alguma coisa ou nao retorna nada.

     /*
      vamos começar com o fato de não retornar nada: void e em seguida nos temos o nome do metodo

      importante: se voce tem um metodo com mais de 3 argumentos, significa seu metodo está fazendo muita coisa.. não é uma boa pratica


      importante: metodo com retorno. Em vez de void, posso usar qualquer tipo de variavel.

      importante: O retorno de um metodo é como voce estivesse inicializando uma variavel, entao precisando colocar dentro de uma variavel, mas nem sempre é necessario.

      ex -> colocando dentro de uma variavel:  double resultado = calculadora.divideDoisNumeros(20, 2); ou
      ex -> executando direto no console:  System.out.println(calculadora.divideDoisNumeros(20,2));

      -----
          public double divideDoisNumeros(double num1, double num2){
         return num1/num2;
    }
        int resultado = (int) calculadora.divideDoisNumeros(20, 2); -> fazendo casting

       -----

       importante: podemos usar o return para metodos void, também

       importante: quando voce tem um metodo System.out.println(), você nao pode colcoar dentro dele uma chamada se um metodo que nao retorna um valor

       uma hora eu irei apagar esse comentários, por enqunto que nao passo para o notion
      */

    public void somaDoisNumeros(){
        System.out.println(10+10);

    }

    public void subraiDoisNumeros (){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){

        if (num2 == 0){ // se no num2 for zero, ja retorna zero!!
            return 0; // o return ele funciona mais ou menos como um break, não é que ele vai parar a execução do metodo, mas quando ele chegar nessa linha ele vai voltar pra quem chamou
        }
         return num1/num2; // aqui nao vai ser executado!!!!


    }

    public double divideDoisNumeros02(double num1, double num2){
        if (num2 !=0 ){
            return num1/num2;
        }
        System.out.println("nao existe divisao por zero");
        return 0;

    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){

        if(num2 == 0){
            System.out.println("Não existe divisao por zero");
            return;
        }
        System.out.println(num1/num2);



    }

    public void alteraDoisNumeros(int num1, int num2){
        // vamos alterar o valor que estamos recebendo nos parametros
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera dois numeros");
        System.out.println("Num1 "+num1 );
        System.out.println("Num2 "+num2);
    }


}
