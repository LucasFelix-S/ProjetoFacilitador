package br.com.refatorandofacilitador.ui;
import javax.swing.*;
import br.com.refatorandofacilitador.file.CsvModel;
import br.com.refatorandofacilitador.file.ReadCsv;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppUi extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField campoEan;
	private JTextField campoLote;
	private JTextField campoValidade;
	private JTextField campoQuantidade;

	public AppUi() {
		CsvModel model = new CsvModel();
		setLayout(null);
		
		JLabel tituloLabel = new JLabel("LANÇAMENTO DE PRODUTO");
		tituloLabel.setBounds(0, 0, 462, 35);
		tituloLabel.setFont(new Font("Arial", Font.BOLD, 14));
		tituloLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(tituloLabel);
		
		campoEan = new JTextField();
		campoEan.setBounds(88, 51, 202, 20);
		campoEan.setFont(new Font("Arial", Font.PLAIN, 11));
		add(campoEan);
		campoEan.setColumns(10);
		
		campoLote = new JTextField();
		campoLote.setBounds(88, 82, 202, 20);
		campoLote.setFont(new Font("Arial", Font.PLAIN, 11));
		campoLote.setColumns(10);
		add(campoLote);
		
		campoValidade = new JTextField();
		campoValidade.setBounds(88, 113, 202, 20);
		campoValidade.setFont(new Font("Arial", Font.PLAIN, 11));
		campoValidade.setColumns(10);
		add(campoValidade);
		
		campoQuantidade = new JTextField();
		campoQuantidade.setBounds(88, 144, 202, 20);
		campoQuantidade.setFont(new Font("Arial", Font.PLAIN, 11));
		campoQuantidade.setColumns(10);
		add(campoQuantidade);
		
		JButton btnArquivo = new JButton("Selecionar Arquivo");
		btnArquivo.setBounds(300, 112, 144, 23);
		btnArquivo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                int returnVal = jfc.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    model.setInputFile(jfc.getSelectedFile().toString());
                    JOptionPane.showMessageDialog(null,
                            "Importação realizada com sucesso!",
                            "Sucesso!",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (returnVal == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null,
                            "Nenhum arquivo foi selecionado",
                            "Atenção!",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
		});
		btnArquivo.setFont(new Font("Arial", Font.PLAIN, 11));
		add(btnArquivo);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(300, 143, 144, 23);
		btnInserir.addActionListener(new ActionListener() {
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

                JOptionPane.showMessageDialog(null,
                        "Dados inseridos.",
                        "Sucesso!",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnInserir.setFont(new Font("Arial", Font.PLAIN, 11));
		add(btnInserir);
		
		JLabel eanLabel = new JLabel("EAN:");
		eanLabel.setBounds(0, 54, 78, 14);
		eanLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		eanLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(eanLabel);
		
		JLabel loteLabel = new JLabel("LOTE:");
		loteLabel.setBounds(0, 85, 78, 14);
		loteLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		loteLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(loteLabel);
		
		JLabel validadeLabel = new JLabel("VALIDADE:");
		validadeLabel.setBounds(0, 116, 78, 14);
		validadeLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		validadeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(validadeLabel);
		
		JLabel quantidadeLabel = new JLabel("QUANTIDADE:");
		quantidadeLabel.setBounds(0, 147, 78, 14);
		quantidadeLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		quantidadeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(quantidadeLabel);
	}
}