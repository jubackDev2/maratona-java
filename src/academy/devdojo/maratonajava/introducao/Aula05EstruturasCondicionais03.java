package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //operador ternário.

        // a condicao é: doar se o salario for > 5000 mil

        // sintaxe operador ternario: (condicao) ? verdadeiro : falso

        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 reais pro DevDOjo";
        String mensagemNaoDoar = "Eu nao tenho condicoes de doar.";
        String resultado = salario > 4000 ? mensagemDoar : mensagemNaoDoar; // operador ternario

        System.out.println(resultado);
    }
}
