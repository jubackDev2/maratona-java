package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {
     // praticando

        int [][] matriz = new int[3][]; // tamanho base do array
        matriz[0] = new int[]{9 , 7}; // aqui eu ja inicializo e declaro quantos espaços  terá em cada indice
        matriz[1] =  new int []{10 , 4};
        matriz[2] = new int[] {6 , 2};

        for (int [] arrayBase: matriz){
            System.out.println("\n----------------");
            for (int num: arrayBase){
                System.out.print(num+" ");
            }
        }


    }
}
