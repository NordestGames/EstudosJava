package Exercicios;

public class Exercicio01 {
    public static void main(String[] args){
        
        /*  Dado um determinado salario anual, Saber o valor que tenho que pagar de imposto
            de 0 a 34.172 paga 9.70%, de 34.172 a 68.507 paga 37.35% e maior que 68.507 paga 49.50%
        */

        double salarioAnual = 80000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34172){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if(salarioAnual >= 34.173 && salarioAnual <= 68.507){
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Valor do imposto: " + valorImposto);
    }
}
