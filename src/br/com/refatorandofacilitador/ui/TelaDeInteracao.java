package br.com.refatorandofacilitador.ui;
import br.com.refatorandofacilitador.file.ReadCsv;
import br.com.refatorandofacilitador.loop.Loop;
import br.com.refatorandofacilitador.file.CsvModel;
import java.util.Scanner;

public class TelaDeInteracao {
    public static void interacaoComUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EAN DO PRODUTO= ");
        String ean = scanner.nextLine();

        System.out.println("LOTE DO PRODUTO= ");
        String lote = scanner.nextLine();

        System.out.println("VALIDADE DO PRODUTO= ");
        String validade = scanner.nextLine();

        System.out.println("QUANTIDADE CONTADA= ");
        int quantidade = scanner.nextInt();

        CsvModel modelo = new CsvModel();
        modelo.setEan(ean);
        modelo.setLote(lote);
        modelo.setValidade(validade);
        modelo.setQuantidade(quantidade);

        ReadCsv.lendoCsv(modelo);

       Loop.inputLoop();
    }
}