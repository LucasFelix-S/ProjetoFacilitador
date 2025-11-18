package br.com.refatorandofacilitador.view;
import br.com.refatorandofacilitador.repository.LeitorCsv;
import br.com.refatorandofacilitador.model.Loop;
import br.com.refatorandofacilitador.model.Modelo;
import java.util.Scanner;

public class TelaDeInteracao {
    public static void InteracaoComUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EAN DO PRODUTO= ");
        String ean = scanner.nextLine();

        System.out.println("LOTE DO PRODUTO= ");
        String lote = scanner.nextLine();

        System.out.println("VALIDADE DO PRODUTO= ");
        String validade = scanner.nextLine();

        System.out.println("QUANTIDADE CONTADA= ");
        int quantidade = scanner.nextInt();

        Modelo modelo = new Modelo();
        modelo.setEan(ean);
        modelo.setLote(lote);
        modelo.setValidade(validade);
        modelo.setQuantidade(quantidade);

        LeitorCsv.lendoCsv(modelo);

       Loop.inputLoop();
    }
}