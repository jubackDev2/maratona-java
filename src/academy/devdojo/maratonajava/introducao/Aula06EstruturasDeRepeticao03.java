package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // usando o break
        // imprima os primeiros 25 numeros de um dado valor. por exemplo 50

        int valorMax = 50;

        for (int i = 1; i <= valorMax; i++) {
            if (i > 25) {
                break;

            }
            System.out.println(i);
        }
    }
}
