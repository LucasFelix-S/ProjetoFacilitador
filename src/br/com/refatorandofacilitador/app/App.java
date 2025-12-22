package br.com.refatorandofacilitador.app;
import javax.swing.JFrame;
import br.com.refatorandofacilitador.ui.AppUi;

public class App {
    public static void main(String[] args) {
    	JFrame frame = new JFrame("Projeto Facilitador - Lucas Felix Santos");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(480, 220);
    	frame.setLocationRelativeTo(null);
    	frame.setContentPane(new AppUi());
    	frame.setVisible(true);
    }
}