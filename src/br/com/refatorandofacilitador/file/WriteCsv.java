package br.com.refatorandofacilitador.file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    public static void escrevendoCsv(String modelo) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("saida.csv", true))){
            bufferedWriter.write(modelo.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Erro= " + e);
        }
    }
}