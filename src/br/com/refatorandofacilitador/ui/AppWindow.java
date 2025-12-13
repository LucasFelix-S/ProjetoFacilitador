package br.com.refatorandofacilitador.ui;
import br.com.refatorandofacilitador.file.CsvModel;

import javax.swing.*;

public class AppWindow {
    public static void interactionInterface() {
        CsvModel model = new CsvModel();

        JFrame frame = new JFrame("Projeto Facilitador - Natus");
        frame.setSize(400, 400);
        frame.setVisible(true);

        JTextField campoEan = new JTextField();
        campoEan.setBounds(33, 38, 158, 20);
        frame.add(campoEan);

        JTextField campoDescricao = new JTextField();
        campoDescricao.setEditable(false);
        campoDescricao.setEnabled(false);
        campoDescricao.setBounds(33, 69, 320, 20);
        frame.add(campoDescricao);

        JTextField campoLote = new JTextField();
        campoLote.setBounds(33, 100, 100,20);
        frame.add(campoLote);

        JTextField campoValidade = new JTextField();
        campoValidade.setBounds(143, 100, 100,20);
        frame.add(campoValidade);

        JTextField campoQuantidade = new JTextField();
        campoQuantidade.setBounds(253, 100, 100,20);
        frame.add(campoQuantidade);

        JButton botaoInserir = new JButton("Inserir");
        botaoInserir.setBounds(33, 131, 100, 23);
        frame.add(botaoInserir);
    }
}