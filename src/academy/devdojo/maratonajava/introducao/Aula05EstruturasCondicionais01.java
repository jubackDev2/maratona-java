package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoBeber = idade >= 18;

        if (isAutorizadoBeber != false) { //so vai executar se for true
            System.out.println("você pode votar, amigo, pois sua idade é: "+ idade+" anos");
        }else { //vai executar se o if não for true
            System.out.println("Voce nao pode votar");
        }

        if (!isAutorizadoBeber ){ //usando o operador de negação pra fazer um else
            System.out.println("Não autorizado");
        }

        System.out.println("fora do programa...");
    }
}
