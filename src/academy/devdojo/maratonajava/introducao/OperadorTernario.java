package academy.devdojo.maratonajava.introducao;

public class OperadorTernario {

    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500$";
        String mensagemNaoDoar = "Não vou doar";

        System.out.println(salario >= 6000 ? mensagemDoar : mensagemNaoDoar);
    }
}
