package br.com.refatorandofacilitador.model;
import br.com.refatorandofacilitador.view.TelaDeInteracao;

public class ControleLoop {
    public static void condicaoLoop(String loop) {
        if (loop.equals("1")) {
            TelaDeInteracao.interacaoComUsuario();
        } else if (loop.equals("2")) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Escolha errada.");
            Loop.inputLoop();
        }
    }
}