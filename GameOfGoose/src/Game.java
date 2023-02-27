import java.util.Random;

class Game {
    private Player[] players;
    private int currentPlayer;

    public Game(String[] playerNames) {
        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
        currentPlayer = 0;
    }

    public void play() {
        Random dice = new Random();
        while (players[currentPlayer].getPosition() < 63) {
            int roll = dice.nextInt(6) + dice.nextInt(6)+ 2;
            System.out.println(players[currentPlayer].getName() + " rolled a " + roll);

            players[currentPlayer].move(roll);

            System.out.println(players[currentPlayer].getName() + " moved to space " + players[currentPlayer].getPosition());
            currentPlayer = (currentPlayer + 1) % players.length;
        }
        System.out.println(players[currentPlayer].getName() + " won the game!");
    }
}