package estudo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Mulher {

    public static void main(String [] args){


        Path caminho = Paths.get("/home/joao/fatec/estudo/teste.txt");
        String texto = "Salve o Corinthians\n" + //
                        "O campeão dos campeões\n" + //
                        "Eternamente\n" + //
                        "Dentro dos nossos corações\n" + //
                        "Salve o Corinthians\n" + //
                        "De tradições e glórias mil\n" + //
                        "Tu és o orgulho\n" + //
                        "Dos esportistas do Brasil\n" + //
                        "Teu passado é uma bandeira\n" + //
                        "Teu presente, uma lição\n" + //
                        "Figuras entre os primeiros\n" + //
                        "Do nosso esporte bretão\n" + //
                        "Corinthians grande\n" + //
                        "Sempre altaneiro\n" + //
                        "És do Brasil\n" + //
                        "O clube mais brasileiro";
        byte[] TesteTesto = texto.getBytes();
        try {
        Files.write(caminho, TesteTesto);
        }catch(Exception erro){

        }

    }
}