package academy.devdojo.maratonajava.estruturascondicionais;

public class EstruturasSwitch {
    public static void main(String[] args) {

        int dia = 4;
        switch (dia) {
            case 1: // Entra no 1, vazio
            case 7: // Entra no 7, FDS. Tornando o case 1 e 7 FDS.
                System.out.println("Final de Semana");
                break;
            case 2: // Entra no 2, vai pulando até cair no caso 6. Com isso todos os cases serão dia úiteis.
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
        }
    }
}
