package estudo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;


public class Leitura {

    public static void main(String[] args){
        

        Path caminho = Paths.get("/home/joao/fatec/estudo/teste.txt");
        try{
         byte[] texto = Files.readAllBytes(caminho);
         String leitura = new String(texto);
 
         JOptionPane.showMessageDialog(null, leitura);
        } catch (Exception erro){

        }

    }
    
}
