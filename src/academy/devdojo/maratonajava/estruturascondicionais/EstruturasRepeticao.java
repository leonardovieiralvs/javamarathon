package academy.devdojo.maratonajava.estruturascondicionais;

public class EstruturasRepeticao {

    public static void main(String[] args) {
        //while, do while, for

        int count = 1;
        while (count <= 10) {                           // condição do while deve resultar em valor TRUE - loop até que o valor chegue a 10.
            System.out.println("while: " + count);
            count++;
        }

        System.out.println("###################");

        do {                                            // executado ao menos uma vez. FAÇA ATÉ .....
            System.out.println("do while: " + count);
            count++;
        } while (count <= 20);

        System.out.println("###################");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}