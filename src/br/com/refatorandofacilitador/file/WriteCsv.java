package br.com.refatorandofacilitador.file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    public static void escrevendoCsv(String model) {
        String localHome = System.getProperty("user.home");
        String destinDirectory = localHome + "\\Downloads\\data.csv";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinDirectory,
                true))){
            bufferedWriter.write(model);
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Error writing output file. Class 'WriteCsv' " + e);
        }
    }
}