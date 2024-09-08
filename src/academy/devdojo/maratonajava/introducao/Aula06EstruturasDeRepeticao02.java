package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 1000000.

        /*
           podemos fazer de diversas formas

           ---------------------------------------


           for (int i = 0; i<=1000000; i+=2) {
                if (i%2 ==0) {
                System.out.println(i);

                }
           }
           ----------------------------------------
         */




        for (int i=0; i<=1000000; i++) {
            if (i%2 ==0) {
                System.out.println(i);
            }


        }
    }
}
