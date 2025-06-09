package tprecurssiva;

import java.io.File;
import java.util.Scanner;

public class diretorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o caminho do diretório: ");
        String caminho = scanner.nextLine();

        File diretorio = new File(caminho);

        if (diretorio.exists() && diretorio.isDirectory()) {
            System.out.println("O diretório existe.");
        } else {
            System.out.println("O diretório NÃO existe.");
        }

        scanner.close();
    }
}
