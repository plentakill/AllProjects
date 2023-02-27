import java.util.Scanner;

class Game {
    private Player[] players;
    private int currentPlayerIndex;

    public Game() {
        players = new Player[3];
        players[0] = new Player("Player 1");
        players[1] = new Player("Player 2");
        players[2] = new Player("Player 3");
        currentPlayerIndex = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Player currentPlayer = players[currentPlayerIndex];
            System.out.println(currentPlayer.getName() + ": Press enter to roll the dice.");
            scanner.nextLine();

            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            System.out.println(currentPlayer.getName() + " rolls " + dice1 + " and " + dice2 + ".");

            currentPlayer.move(dice1, dice2);
            System.out.println(currentPlayer.getName() + " moves to position " + currentPlayer.getPosition() + ".");

            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        }
    }
}