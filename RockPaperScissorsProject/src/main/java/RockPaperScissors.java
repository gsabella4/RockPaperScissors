import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String opponentPlay = "";
        int gamerWinCount = 0;
        int gamerLossCount = 0;
        int gameCount = 0;

        System.out.println("\n\t\tWelcome to the Rock, Paper, Scissors Game!!!");
        System.out.println("\n:*・☆彡.。.:*・☆彡     Time to play!     ☆彡.。.:*・☆彡.。.:*");

        while (gameCount < 5) {

            System.out.print("\nTo start game, enter either Rock, Paper, or Scissors: ");
            String gamerPlay = userInput.nextLine();
            gameCount++;

            int randomInt = new Random().nextInt(3);
            if (randomInt == 0) {
                opponentPlay = "Rock";
            } else if (randomInt == 1) {
                opponentPlay = "Paper";
            } else if (randomInt == 2) {
                opponentPlay = "Scissors";
            }

            if (gamerPlay.equalsIgnoreCase("Paper") || gamerPlay.equalsIgnoreCase("Rock") || gamerPlay.equalsIgnoreCase("Scissors")) {
                if (gamerPlay.equalsIgnoreCase("Rock") && opponentPlay == "Paper") {
                    gamerLossCount++;
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nYou lose! Paper beats Rock");
                } else if (gamerPlay.equalsIgnoreCase("Rock") && opponentPlay == "Rock") {
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nDraw! Better luck next time!");
                } else if (gamerPlay.equalsIgnoreCase("Rock") && opponentPlay == "Scissors") {
                    gamerWinCount++;
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nWinner! Rock beats Scissors!");
                }

                if (gamerPlay.equalsIgnoreCase("Paper") && opponentPlay == "Scissors") {
                    gamerLossCount++;
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nYou lose! Scissors beat Paper");
                } else if (gamerPlay.equalsIgnoreCase("Paper") && opponentPlay == "Paper") {
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nDraw! Better luck next time!");
                } else if (gamerPlay.equalsIgnoreCase("Paper") && opponentPlay == "Rock") {
                    gamerWinCount++;
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nWinner! Paper beats Rock!");
                }

                if (gamerPlay.equalsIgnoreCase("Scissors") && opponentPlay == "Rock") {
                    gamerLossCount++;
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nYou lose! Rock beats Scissors");
                } else if (gamerPlay.equalsIgnoreCase("Scissors") && opponentPlay == "Scissors") {
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nDraw! Better luck next time!");
                } else if (gamerPlay.equalsIgnoreCase("Scissors") && opponentPlay == "Paper") {
                    gamerWinCount++;
                    System.out.println("\nYour opponent played " + opponentPlay);
                    System.out.println("\nWinner! Scissors beats Paper!");
                }
            } else {
                System.out.println("\nNo chance! You must play Rock, Paper, or Scissors.");
                gameCount -= 1;
            }
        }


        System.out.println("\n\n｡+ﾟ☆ﾟ+｡★｡+ﾟ☆ﾟ+｡★｡+ﾟ☆     Game Statistics    ｡+ﾟ☆ﾟ+｡★｡+ﾟ☆ﾟ+｡★｡+ﾟ☆");
        System.out.println("\n\t\t\t\t\t\tTotal Wins: " + gamerWinCount);
        System.out.println("\t\t\t\t\t\tTotal Losses: " + gamerLossCount);
        double winPercentage = ((double) gamerWinCount / (double) gameCount) * 100;
        System.out.println("\t\t\t\t\t\tWin Percentage: " + winPercentage + "%");
    }
}

