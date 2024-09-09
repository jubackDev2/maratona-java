package academy.devdojo.maratonajava.introducao;

import java.io.FileOutputStream;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado um valor de um carro, descubra, em quantas vezes ele pode ser parcelado
        // valor de um carro 50 mil
        // a condição é que o valor da parcela tem que ser >= 1000






        int valorCarro = 80000;

        for (int parcela = 1; parcela < valorCarro; parcela++) {

            int res = valorCarro/parcela; //

            if (res >= 1000) {
                System.out.println("parcela::: "+ parcela+" $ "+ res);
            }
        }






























    }
}


