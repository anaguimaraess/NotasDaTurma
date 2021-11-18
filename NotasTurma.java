import java.util.InputMismatchException;
import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        try {
            String[] nomes = new String[5];
            double[] notas = new double[5];
            double somaDeNotas, media;
            somaDeNotas = 0;

            for (int i = 0; i <= 4; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do aluno " + (i + 1) + ":");
                nomes[i] = sc.next();

                System.out.println("Digite a nota deste aluno: ");
                notas[i] = sc.nextDouble();
                somaDeNotas += notas[i];
            }

            media = somaDeNotas / 5;
            System.out.println("A média das notas dos alunos é: " + media);
            System.out.println("Os alunos com nota acima da média são: ");


            for (int i = 0; i <= 4; i++) {
                if (notas[i] > media)
                    System.out.println("-> " + nomes[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Você digitou uma letra ao invés de uma nota. Reinicie o programa.");

        }
    }
}