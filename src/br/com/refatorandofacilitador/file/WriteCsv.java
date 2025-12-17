package br.com.refatorandofacilitador.file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    public static void escrevendoCsv(String modelo) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.csv", true))){
            bufferedWriter.write(modelo.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Error writing output file. Class 'WriteCsv' " + e);
        }
    }
}