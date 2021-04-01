import java.util.Scanner;

public class Game {

    private Player playerA, playerB;
    private Scanner scanner;

    public Game() {
        playerA = new Player("A");
        playerB = new Player("B");
        scanner = new Scanner(System.in);
    }

    public void runGameTurn() {
        while (true) {
            if(playerA.takeTurn(scanner)) {
                System.out.println("Player A has won.");
                break;
            }
            if (playerB.takeTurn(scanner)) {
                System.out.println("Player B has won.");
                break;
            }
        }
    }

}
