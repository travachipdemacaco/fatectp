package simulado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("João Luiz");

        List<Double> minhasNotas = Arrays.asList(8.0, 7.5, 9.0, 6.5);
        aluno.setNotas(minhasNotas);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média das notas: %.2f\n", aluno.calcularMedia());
    }
}
