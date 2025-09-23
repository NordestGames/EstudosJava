package EstruturasCondicionais;

public class ElseIf {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil 
        // idade >= 18 categoria adulto
        int idade = 17;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infatil";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.err.println(categoria);

    }
}
