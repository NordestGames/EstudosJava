package EstruturaDeRepeticao;

public class Repeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count += 1;
        }

        // do while executa pelo menos uma vez mesmo a condição seja falsa ou verdadeiro
        do {
            System.err.println("Dentro do do-while");
        } while(count < 10);

        for(int i = 0; i < 10; i++){
            System.err.println("For " + i);
        }
    }
}
