package Exercicios;

public class ExercicioFuncionario {
    public String nome;
    public int idade;
    public Double[] salarios;

    public void imprimirDados(){
        System.out.println("-------------");

        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for(double salario : salarios){
            System.out.print(salario + " ");
        }
        
        imprimirMediaSalario();
    }

    public void imprimirMediaSalario(){
        if(salarios == null){
            return;
        }
        Double media = 0.0;
        for (Double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.err.printf("\nMedia Salarial: %.2f", media);
    }

}
