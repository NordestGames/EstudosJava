public class Operadores {
    public static void main(String[] args){
        // +  -  /  *  Aritiméticos
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // % Relacionaios
        int resto = 20 % 2;
        System.out.println(resto);

        // < >  <= >=  ==  !=  Lógicos(valores boolean)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte" + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte" + isDezIgualVinte);
        System.out.println("isDezIgualDez" + isDezIgualDez);
        System.out.println("isDezDiferenteDez" + isDezDiferenteDez);
        
    }
}
