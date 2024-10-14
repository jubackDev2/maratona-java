package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt [0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];
        /*
        podemos inicializar de outra forma

        arrayInt [0] = new int {1, 2};
        arrayInt [1] = new int {1,2, 3}
        arrayInt [2] = new int {1, 2, 3, 4, 5, 6};
        int arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}} ;// uma outra forma de inicializar uma array multidimensional.

         */




        for (int[] arrBase: arrayInt){
            System.out.println("\n-----------------");
            for (int num: arrBase){
                System.out.print(num + " ");
            }
        }



    }
}
