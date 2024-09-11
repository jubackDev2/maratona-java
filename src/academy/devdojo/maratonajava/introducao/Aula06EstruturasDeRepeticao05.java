package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int)valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) { // valor menor que mil é ignorado, pois é false e a proxima linha é executada
                continue;
            }

            System.out.println("parcela "+ parcela + " $ "+ valorParcela);

        }
    }
}
