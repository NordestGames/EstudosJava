package Exercicios;

public class ExerciocioFuncionarioTeste {
    public static void main(String[] args) {
        ExercicioFuncionario funcionario01 = new ExercicioFuncionario();

        funcionario01.nome = "Boyzin";
        funcionario01.idade = 25;
        funcionario01.salarios = new Double[]{1200.0, 937.32, 2000.0};

        funcionario01.imprimirDados();
        
    }
}
