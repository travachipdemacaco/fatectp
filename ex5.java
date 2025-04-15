import java.util.Scanner;
import java.util.Locale;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Quantidade de alunos: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        double[] medias = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Nota 1º semestre: ");
            notas1[i] = scanner.nextDouble();
            
            System.out.print("Nota 2º semestre: ");
            notas2[i] = scanner.nextDouble();
            scanner.nextLine();
            
            medias[i] = (notas1[i] + notas2[i]) / 2;
        }
        
        System.out.println("\nALUNOS APROVADOS:");
        for (int i = 0; i < n; i++) {
            if (medias[i] >= 6.0) {
                System.out.printf("%s - Média: %.2f\n", nomes[i], medias[i]);
            }
        }
        
        scanner.close();
    }
}