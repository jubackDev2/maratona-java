package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // uma nova forma de inicializar os arrays e imprimir

        int[]numeros2 = {1,2,3,4,5};
        int[]numeros3 = new int []{1,2,3,4,5};

        // forma padrao -

            // for(int i =0; i < numeros3.length; i++){
              //  System.out.println(numeros3[3]);

        //   --  nova forma de imprimir arrays
            // foreach
            //  se voce precisar acessar um indice especifico, va para o for indexado. ->for(int i =0; i < numeros3.length; i++)
                for(int num:numeros3) {
                    System.out.println(num);
                }


    }
}
