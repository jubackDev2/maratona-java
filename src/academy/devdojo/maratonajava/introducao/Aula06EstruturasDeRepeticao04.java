package academy.devdojo.maratonajava.introducao;

import java.io.FileOutputStream;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado um valor de um carro, descubra, em quantas vezes ele pode ser parcelado
        // valor de um carro 50 mil
        // a condição é que o valor da parcela tem que ser valorParcela >= 1000


        int valorCarro = 80000;

        for (int parcela = 1; parcela < valorCarro; parcela++) {  //   vai dividir o valor do carro  pelo número de parcelas, começando de 1 e indo até o valor do carro
            int valorParcela = valorCarro / parcela; //  A variavel "res" que criei calcula o valor da parcela, Então se a parcela for 1, o resultado será 80.000/1...

            if (valorParcela >= 1000) {  // garante que apenas parcelas onde o valor seja maior ou igual a 1.000 sejam impressas no console.

                System.out.println("parcela::: " + parcela + " $ " + valorParcela);


            } else {
                break;
            }


        }


    }
}


