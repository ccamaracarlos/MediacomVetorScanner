package testevetor;

import java.util.Scanner;

public class UtilizandoVetor {
    public static void main(String[] args) {

        final int TOTAL_ALUNOS = 4;
        final int TOTAL_BIMENTRES = 4;
        final double NOTA_MINIMA = 70.0;

        Scanner input = new Scanner(System.in);
        String[] nomeAlunos = new String[TOTAL_ALUNOS];
        double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMENTRES];
        double[] mediaAlunos = new double[TOTAL_ALUNOS];
        // OBTER NOME DOS ALUNOS

        for (int i = 0; i < TOTAL_ALUNOS; ++i) {
            System.out.println("Informe o nome do " + (i + 1) + "º Aluno: ");
            nomeAlunos[i] = input.nextLine();
        }

        System.out.println(" ");

        // OBTER NOTA DOS ALUNOS DE TODOS OS BIMESTRES

        for (int i = 0; i < TOTAL_ALUNOS; ++i) {
            for (int j = 0; j < TOTAL_BIMENTRES; ++j) {
                System.out.println("Informe a nota do Aluno " + nomeAlunos[i] +
                        " para o " + (j + 1) + "º Bimestre!");
                notaAlunos[i][j] = input.nextDouble();
            }
        }
        // CALCULAR A MÉDIA DE TODOS OS ALUNOS

        for (int i = 0; i < TOTAL_ALUNOS; ++i) {
            for (int j = 0; j < TOTAL_BIMENTRES; ++j) {
                mediaAlunos[i] += notaAlunos[i][j];
            }
            mediaAlunos[i] /= TOTAL_BIMENTRES;
        }

        //MOSTRAR SITUAÇÃO DO ALUNO

        System.out.println("RESULTADO FINAL");

        for (int i = 0; i < TOTAL_ALUNOS; ++i) {
            if (mediaAlunos[i] < NOTA_MINIMA) {
                System.out.println(nomeAlunos[i] + ", Sua média é de: "+ mediaAlunos[i] + " INELIZMENTE, Você está Reprovado!!!");
            } else {
                System.out.println("PARABÉNS " + nomeAlunos[i] + ", Sua média é de: " + mediaAlunos[i] +" Você está Aprovado!!!");
            }

        }
    }
}