/*
 Prática

 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem: 

 Eu <nome> morando no endereço <endereço>,
 confirmo que recebi o salário de <salário>, na data <data>
 */


public class PrimitivoExecicio {
    public static void main(String[] args){

        String nome = "Anailton", ender = "Rua dos Bobos";
        float salario = 2500.0F;
        String dataRecebe = "29/08/2025";

        String relatorio = "Eu " +nome+ " morando no endereço: " + ender + ", confirmo que recebi o salário de R$ " + salario + ", na data " + dataRecebe;
        System.out.println(relatorio);

       // System.out.println("Eu " + nome + " morando no endereço: " + ender + " \nconfirmo que recebi o salário de R$ " + salario + ", na data " + dataRecebe);
       // System.out.printf("Eu %s morando no endereço: %s, %nconfirmo que recebi o salário de R$ %.2f ,na data  %s", nome, ender, salario, dataRecebe);

    }
}
