package br.com.refatorandofacilitador.file;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
    public static String readingCsv(CsvModel model) {
        String file = "dados-cadastrais-dos-produtos.csv";
        String lines = "";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while((lines = bufferedReader.readLine()) != null) {
                if(lines.contains(model.getEan())) {
                    System.out.println(lines);
                    model.setResultado(lines);
                    WriteCsv.escrevendoCsv(model.toString());
                    break;
                }
            }
        } catch(IOException e) {
            System.out.println("Error while reading the .csv file. Class 'ReadCsv' " + e.getMessage());
        }
        return lines;
    }
}
