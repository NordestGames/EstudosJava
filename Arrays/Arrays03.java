package Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // Formas de inicializar Array
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numero3 = new int[]{1,2,3,4,5};

        // foreach
        for(int num : numero3){
            System.out.println(num);
        }

    }
}
