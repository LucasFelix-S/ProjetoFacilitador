package br.com.refatorandofacilitador.repository;
import br.com.refatorandofacilitador.model.Modelo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorCsv {
    public static String lendoCsv(Modelo modelo) {
        String arquivo = "dados-leitura-java.csv";
        String linhas = "";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
            while((linhas = bufferedReader.readLine()) != null) {
                if(linhas.contains(modelo.getEan())) {
                    System.out.println(linhas);
                    modelo.setResultado(linhas);
                    EscreverCsv.escrevendoCsv(modelo.toString());
                    break;
                } else {
                    System.out.println("EAN não encontrado no arquivo .csv. Imprimindo modelo genérico: ");
                    System.out.println(modelo.getEan());
                    System.out.println(modelo.getLote());
                    System.out.println(modelo.getValidade());
                    System.out.println(modelo.getQuantidade());
                }
            }
        } catch(IOException f) {
            System.out.println("Erro= " + f.getMessage());
        }
        return linhas;
    }
}
