package simulado;

import java.io.*;

public class Texto {
    public static void main(String[] args) {
        String caminhoArquivo = "/home/joao/fatec/simulado/teste.txt"; // somente no linux

        int totalLinhas = 0;
        int totalPalavras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println("Linha lida: " + linha); // debug
                totalLinhas++;

                if (!linha.trim().isEmpty()) {
                    String[] palavras = linha.trim().split("\\s+");
                    totalPalavras += palavras.length;
                }
            }

            double media = (totalLinhas > 0) ? (double) totalPalavras / totalLinhas : 0;

            System.out.println("Total de linhas: " + totalLinhas);
            System.out.printf("Média de palavras por linha: %.2f\n", media);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo NÃO encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
