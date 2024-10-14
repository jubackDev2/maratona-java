package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [] [] dias = new int [3] [3];

        // dias -> 0, 1, 2 -> i

        dias [0] [0] = 31;
        dias [0] [1] = 28;
        dias [0][2] = 30;

        dias [1][0] = 30;
        dias [1][1]= 28;
        dias [1][2] = 31;


        dias [2][0] = 30;
        dias [2][1]= 28;
        dias [2][2] = 31;

       for (int i = 0; i < dias.length; i++) { // dias.length Retorna o número de linhas no array multidimensional.
           System.out.println(i);

       }



    }
}
