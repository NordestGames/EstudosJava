package EstruturasCondicionais;

public class IF {
    public static void main(String[] args){
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebeida alcólica");
        } else{
            System.out.println("Não autorizado a comprar bebeida alcólica");
        }

       

        System.out.println("Fora do if");


    }
}
