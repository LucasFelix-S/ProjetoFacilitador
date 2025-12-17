package br.com.refatorandofacilitador.ui;
import br.com.refatorandofacilitador.file.CsvModel;
import br.com.refatorandofacilitador.file.ReadCsv;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow {
    public static void interactionInterface() {
        CsvModel model = new CsvModel();

        JFrame frame = new JFrame("Projeto Facilitador - Natus");
        frame.setSize(400, 210);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
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
        botaoInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setEan(campoEan.getText());
                model.setLote(campoLote.getText());
                model.setValidade(campoValidade.getText());
                model.setQuantidade(campoQuantidade.getText());
                ReadCsv.readingCsv(model);

                campoEan.setText("");
                campoLote.setText("");
                campoValidade.setText("");
                campoQuantidade.setText("");
            }
        });

        JButton botaoSelecionaArquivo = new JButton("...");
        botaoSelecionaArquivo.setBounds(143, 131, 25, 23);
        frame.add(botaoSelecionaArquivo);
        botaoSelecionaArquivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(null);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println(chooser.getSelectedFile());
                }
            }
        });
    }
}