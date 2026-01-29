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


        double totalValue = 30000;

        for (int parcela = 1; parcela < totalValue; parcela++) {
            double valorParcela = totalValue / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }

        System.out.println("###################");

        for (int parcela = (int) totalValue; parcela >= 1; parcela--) {
            double valorParcela = totalValue / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+parcela+ " - R$"+valorParcela);

        }
    }
}