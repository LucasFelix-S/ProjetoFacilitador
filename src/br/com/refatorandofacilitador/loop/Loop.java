package br.com.refatorandofacilitador.loop;

import java.util.Scanner;
public class Loop {
    public static void inputLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que deseja fazer agora?");
        System.out.println("1. Continuar lançamento");
        System.out.println("2. Sair");
        String escolha = scanner.nextLine();
        LoopControl.condicaoLoop(escolha);
    }
}
