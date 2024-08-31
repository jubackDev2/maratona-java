package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {

    public static void main(String[] args) {
        //EXERCICIO
        // -> dados os valores de 1 a 7, imprima se é dia ultil ou final de semana.1

        byte diaDaSemana = 7;

        switch (diaDaSemana){
            case 1:
                System.out.println("Final de Semana");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;

            default:
                System.out.println("invalido");





        }

    }
}
