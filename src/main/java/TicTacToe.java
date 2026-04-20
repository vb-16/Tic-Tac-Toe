import java.util.Random;

public class TicTacToe {

    static char player1Symbol;
    static char player2Symbol;
    static String currentPlayer;

    public static void main(String[] args) {

        toss();

        System.out.println("Player 1 symbol: " + player1Symbol);
        System.out.println("Player 2 symbol: " + player2Symbol);
        System.out.println("First turn: " + currentPlayer);
    }

    public static void toss() {
        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = "Player 1";
            System.out.println("Player 1 won the toss!");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = "Player 2";
            System.out.println("Player 2 won the toss!");
        }
    }
}