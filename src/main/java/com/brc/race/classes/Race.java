package com.brc.race.classes;

import java.security.SecureRandom;
import java.util.Random;

public class Race {
    
    private Competitor turtle = new Competitor("T");
    private Competitor hare = new Competitor("H");
    private static final SecureRandom random = new SecureRandom();
    private static int n;

    public void start() throws InterruptedException{
        showCountdownInTerminal();
        do {
            clearConsole();
            System.out.println("BANG !!!!! \nE LÁ VÃO ELES !!!!!\n\n");
            n = random.nextInt(10) + 1;
            moveCompetitors(n);
            showTracks();
            System.out.printf("%40s%s%d]%n", "[", Moves.getTypeMovement(turtle.symbol, n) > 0 ? "+" : "", Moves.getTypeMovement(turtle.symbol, n));
            System.out.printf("%40s%s%d]", "[", Moves.getTypeMovement(hare.symbol, n) > 0 ? "+" : "", Moves.getTypeMovement(hare.symbol, n));
            showStatus();
            Thread.sleep(450);
        } while (!hasWon(hare) && !hasWon(turtle));
        
        if (turtle.won) {
            System.out.println("[A Tartaruga ganhou!]");
        }
        else {
            System.out.println("[A Lebre ganhou!]");
        }
    }


    private void showStatus() {
        if (turtle.currentPos == hare.currentPos) {
            System.out.println("\n\nAIIII!!!");
        }
        else if (turtle.currentPos > hare.currentPos) {
            //String[] t = {"A PEQUENA ESTÁ NA FRENTE!!!", "VAI TARTARUGA VAI!!!", "A TARTARUGA ESTÁ NA VANTAGEM!!!", "A LEBRE COMEU POEIRA!"};
            //System.out.println(t[random.nextInt(t.length - 1)]);
            System.out.println("\n\nVAI TARTARUGA!!!");
        }
        else {
            //String[] h = {"A LEBRE ESTÁ NA FRENTE!", "A COITADA ESTÁ FICANDO PARA TRÁS!!!", "VAI LEBRE VAI VAI VAI!!!!!!!!!", "NÃO DESISTA PEQUENA!"};
            //System.out.println(h[random.nextInt(h.length - 1)]);
            System.out.println("\n\nVAI LEBREE!!");
        }
    }
    private void showCountdownInTerminal() throws InterruptedException{
        clearConsole();
        System.out.println("  ***  \n *   *\n    *\n   **  \n    *\n *   *\n  *** ");
        Thread.sleep(950);
        clearConsole();
        System.out.println(" *****\n*     *\n      *\n     * \n    *  \n   *   \n*******");
        Thread.sleep(950);
        clearConsole();
        System.out.println("   *  \n  **  \n * *  \n   *  \n   *  \n   *  \n*******");
        Thread.sleep(950);
        clearConsole();
    }

    private boolean hasWon(Competitor competitor) {
        return competitor.won;
    }

    private final void showTracks() {
        turtle.track.showInTerminal();
        hare.track.showInTerminal();
    }

    private final void moveCompetitors(int movement) {
        turtle.move(movement);
        hare.move(movement);
    }

    private static final void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

