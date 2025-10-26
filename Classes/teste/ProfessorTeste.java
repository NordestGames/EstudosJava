package Classes.teste;

import Classes.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " \nIdade: " + professor.idade + " \nSexo: " + professor.sexo );
    }
}
