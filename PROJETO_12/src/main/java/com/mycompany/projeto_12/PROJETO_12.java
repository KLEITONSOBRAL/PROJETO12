package com.mycompany.projeto_12;

import java.util.Scanner;

public class PROJETO_12 {
  
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Jogador 1, escolha um filme: ");
        String filmeEscolhido = scanner.nextLine();
        
        String[] dicas = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Jogador 1, de a dica " + (i + 1) + ":");
            dicas[i] = scanner.nextLine();
        }

        
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        
        boolean acertou = false;
        for (int tentativa = 1; tentativa <= 5; tentativa++) {
            System.out.println("Tentativa " + tentativa + ":");
            System.out.println("Dica: " + dicas[tentativa - 1]);
            System.out.println("Qual e o filme? ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase(filmeEscolhido)) {
                System.out.println("Parabens, voce acertou!");
                acertou = true;
                break;
            } else {
                System.out.println("Resposta incorreta. Tente novamente.");
            }
        }

        if (!acertou) {
            System.out.println("Voce usou todas as tentativas. O filme era: " + filmeEscolhido);
        }

        scanner.close();
    }
}
