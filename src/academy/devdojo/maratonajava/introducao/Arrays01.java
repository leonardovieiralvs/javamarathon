package academy.devdojo.maratonajava.introducao;

public class Arrays01 {
    public static void main(String[] args) {

        int[] idades = new int[3];

        for (int i = 0; i < idades.length; i++) {
            idades[0] = i;
            System.out.println(idades[0]);
        }
    }
}