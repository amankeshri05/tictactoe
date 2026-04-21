import java.util.Random;
public class Tictactoe {
    static char userSymbol;
    static char computerSymbol;
    static String currentPlayer;

    public static void main(String[] args) {
        tossToDecide();
        displayGameInfo();
    }

    // Method to perform toss
    public static void tossToDecide() {
        Random random = new Random();

        // 0 -> User starts, 1 -> Computer starts
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            computerSymbol = 'X';
            userSymbol = 'O';
        }
    }

    // Method to display result
    public static void displayGameInfo() {
        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " will start first.");

        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}

