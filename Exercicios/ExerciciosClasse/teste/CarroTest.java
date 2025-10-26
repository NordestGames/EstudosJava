package Exercicios.ExerciciosClasse.teste;

import Exercicios.ExerciciosClasse.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Chevette";
        carro1.modelo = "S/R";
        carro1.ano = 1973;

        carro2.nome = "Celta";
        carro2.modelo = "Super";
        carro2.ano = 2000;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome + " \nModelo: " + carro1.modelo + " \nAno: " + carro1.ano);
        System.out.println("------------------------");
        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome + " \nModelo: " + carro2.modelo + " \nAno: " + carro2.ano);

    }
}
