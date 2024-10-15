package academy.devdojo.maratonajavacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajavacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro02 = new Carro();
        Carro carro03 = new Carro();
        carro.nome = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2022;

        carro02.nome = "Honda";
        carro02.modelo = "civic";
        carro02.ano = 2021;

        carro03.nome = "Volkswagen";
        carro03.modelo = "Golf";
        carro03.ano = 2000;

        System.out.println("Carro1 :"+carro.nome+" "+carro.modelo +" "+ carro.ano);
        System.out.println("Carro2: "+carro02.nome+" "+carro02.modelo+" "+ carro02.ano);
        System.out.println("Carro3: "+carro03.nome+" "+carro03.modelo+" "+carro03.ano);

    }
}
