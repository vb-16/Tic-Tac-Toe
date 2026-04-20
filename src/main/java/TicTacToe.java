import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // UC3: get slot input
        int slot = getUserInput();

        // UC4: convert slot → row & column
        int[] index = convertSlotToIndex(slot);

        int row = index[0];
        int col = index[1];

        System.out.println("Slot " + slot + " maps to:");
        System.out.println("Row: " + row + ", Column: " + col);
    }

    // UC3
    public static int getUserInput() {
        System.out.print("Enter a slot number (1-9): ");
        return scanner.nextInt();
    }

    // UC4
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }
}