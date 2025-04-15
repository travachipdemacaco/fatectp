import java.util.Scanner;
import java.util.Locale;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Quantidade de pessoas: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        double[] alturas = new double[n];
        char[] generos = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nPessoa " + (i + 1) + ":");
            System.out.print("Altura (m): ");
            alturas[i] = scanner.nextDouble();
            
            System.out.print("Gênero (M/F): ");
            generos[i] = scanner.next().charAt(0);
            scanner.nextLine();
        }

        double maior = alturas[0];
        double menor = alturas[0];
        double somaMulheres = 0;
        int countMulheres = 0;
        int countHomens = 0;
        
        for (int i = 0; i < n; i++) {

            if (alturas[i] > maior) {
                maior = alturas[i];
            }
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
            
            if (generos[i] == 'F' || generos[i] == 'f') {
                somaMulheres += alturas[i];
                countMulheres++;
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                countHomens++;
            }
        }
        
        System.out.println("\nRESULTADOS:");
        System.out.printf("Maior altura: %.2fm\n", maior);
        System.out.printf("Menor altura: %.2fm\n", menor);
        
        if (countMulheres > 0) {
            System.out.printf("Média de altura das mulheres: %.2fm\n", somaMulheres / countMulheres);
        } else {
            System.out.println("Não há mulheres no grupo.");
        }
        
        System.out.println("Número de homens: " + countHomens);
        
        scanner.close();
    }

}