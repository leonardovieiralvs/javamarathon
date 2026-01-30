package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        mediaSalario();

    }

    public void mediaSalario() {

        if (salarios == null) {
            return;
        }
        double sum = 0;
        for (double total : salarios) {
            sum += total;
        }
        System.out.println("Média salarial: "+sum/salarios.length);
    }
}
