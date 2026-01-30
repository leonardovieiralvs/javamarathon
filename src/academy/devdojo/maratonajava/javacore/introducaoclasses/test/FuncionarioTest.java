package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        double[] soldo = {1200, 987.32, 2000};

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "LVS";
        funcionario.idade = 20;
//        funcionario.salarios = soldo;

        funcionario.imprime();

    }
}
