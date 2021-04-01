import java.util.Scanner;

public class Player {
    private String identifier;
    private int totalScore, roundScore;

    public Player(String identifier) {
        this.identifier = identifier;
    }

    /**
    @param min the minimum integer to roll (inclusive)
     @param max the maximum integer to roll (non inclusive)
     */
    private static int getRandomInteger(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }

    private void endTurn() {
        System.out.println(String.format("You scored %d this round.", roundScore));
        totalScore += roundScore;
        System.out.println(String.format("Total Score: %d.", totalScore));
        roundScore = 0;
    }

    /**
    @return if the player has won
     */
    public boolean takeTurn(Scanner scanner) {
        while (true) {
            if (totalScore >= 20) {
                return true;
            }
            System.out.println(String.format("It is Player %s turn.", identifier));
            System.out.println("Enter a choice");
            final String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "R":
                    final int roll = getRandomInteger(1, 7);
                    System.out.println(String.format("You rolled a %d.", roll));
                    if (roll == 1) {
                        roundScore = 0;
                        endTurn();
                        return false;
                    } else {
                        roundScore += roll;
                        System.out.println(String.format("Points in this round: %d", roundScore));
                        if (roundScore >= 20) {
                            endTurn();
                            return true;
                        }
                    }
                    break;
                case "H":
                    endTurn();
                    return totalScore >= 20;
                default:
                    System.out.println("STOP BEING DA BIG DUMB!");
                    break;
            }
        }
    }

}
