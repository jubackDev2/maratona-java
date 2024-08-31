package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {

    public static void main(String[] args) {
        // valores que posso utilizar no switch
        // sao: int, char, byte, enum, String
        // Depois de todos os case, colocar break;
        // podemos colocar um default, caso nenhu, dos case seja executado
        byte dia = 40;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;

            default:
                System.out.println("opçao invalida!");



        }

        char sexo = 'M';

        switch (sexo){
            case 'M':
                System.out.println("mulher");
                break;
            case 'H':
                System.out.println("Homem");
                break;
        }

    }
}
