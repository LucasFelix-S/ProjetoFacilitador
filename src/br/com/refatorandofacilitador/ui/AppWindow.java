package br.com.refatorandofacilitador.ui;
import br.com.refatorandofacilitador.file.CsvModel;
import br.com.refatorandofacilitador.file.ReadCsv;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow {
    public static void interactionInterface() {
        CsvModel model = new CsvModel();

        JFrame frame = new JFrame("Projeto Facilitador - Natus");
        frame.setSize(445, 220);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        JLabel jLabelTitulo = new JLabel();
        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 14));
        jLabelTitulo.setBounds(0,0,443, 25);
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("LANÇAMENTO DE PRODUTOS");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        frame.add(jLabelTitulo);

        JLabel jLabelEan = new JLabel("EAN:");
        jLabelEan.setFont(new java.awt.Font("Arial", 1, 10));
        jLabelEan.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelEan.setBounds(0, 45, 70, 20);
        frame.add(jLabelEan);

        JLabel jLabelLote = new JLabel("LOTE:");
        jLabelLote.setFont(new java.awt.Font("Arial", 1, 10));
        jLabelLote.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelLote.setBounds(0, 70, 70, 20);
        frame.add(jLabelLote);

        JLabel jLabelValidade = new JLabel("VALIDADE:");
        jLabelValidade.setFont(new java.awt.Font("Arial", 1, 10));
        jLabelValidade.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelValidade.setBounds(0, 95, 70, 20);
        frame.add(jLabelValidade);

        JLabel jLabelQuantidade = new JLabel("QUANTIDADE:");
        jLabelQuantidade.setFont(new java.awt.Font("Arial", 1, 10));
        jLabelQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelQuantidade.setBounds(0, 120, 70, 20);
        frame.add(jLabelQuantidade);

        JTextField campoEan = new JTextField();
        campoEan.setBounds(75, 45, 200, 20);
        frame.add(campoEan);

        JTextField campoLote = new JTextField();
        campoLote.setBounds(75, 70, 200, 20);
        frame.add(campoLote);

        JTextField campoValidade = new JTextField();
        campoValidade.setBounds(75, 95, 200, 20);
        frame.add(campoValidade);

        JTextField campoQuantidade = new JTextField();
        campoQuantidade.setBounds(75, 120, 200, 20);
        frame.add(campoQuantidade);

        JButton botaoInserir = new JButton("Inserir");
        botaoInserir.setBounds(285, 120, 140, 20);
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

        JButton botaoSelecionaArquivo = new JButton("Escolher Arquivo");
        botaoSelecionaArquivo.setBounds(285, 45, 140, 20);
        frame.add(botaoSelecionaArquivo);
        botaoSelecionaArquivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                String file;
                int returnVal = chooser.showOpenDialog(null);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    file = chooser.getSelectedFile().toString();
                    model.setNewFile(file);
                    JOptionPane.showMessageDialog(null,
                            "Importação realizada com sucesso",
                            "sucesso"
                    ,JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}