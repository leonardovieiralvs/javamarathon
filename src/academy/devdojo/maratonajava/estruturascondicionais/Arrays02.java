package academy.devdojo.maratonajava.estruturascondicionais;

public class Arrays02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Mikasa";
        nomes[1] = "Armin";
        nomes[2] = "Eren";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[4];
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
