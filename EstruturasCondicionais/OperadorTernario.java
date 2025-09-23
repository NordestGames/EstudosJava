package EstruturasCondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;

        // Operador ternário
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);
    }
}
