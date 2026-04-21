import java.util.Scanner;
public class Tictactoe {
    public static void main(String[] args) {
        int slot = getUserInput();
        System.out.println("You selected slot: " + slot);
    }
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        while (slot < 1 || slot > 9) {
            System.out.print("Invalid input! Enter number between 1-9: ");
            slot = sc.nextInt();
        }

        return slot;
    }
}
