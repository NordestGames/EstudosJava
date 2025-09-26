package EstruturasCondicionais;

public class EstruturaSwitch {
    public static void main(String[] args) {
        // Imprimir o dia da semana, considerando 1 como domingo
        byte dia = 5;
        
        // valores que switch pode receber char, int, byte, short, enum, String
        switch(dia){
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
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        // Imprima se a pessoa é homem ou mulher baseado no sexo M ou F
        char sexo = 'M';
        switch(sexo){
            case 'M':
                System.out.println("Masculino");
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Inválido");
        }
    }
}
