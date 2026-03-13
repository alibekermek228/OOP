package Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.initialize();

        Scanner sc = new Scanner(System.in);

        while (true) {
            board.printBoard();
            System.out.println("Enter move: fromRow fromCol toRow toCol");
            System.out.println("Enter -1 to exit");

            int fromRow = sc.nextInt();
            if (fromRow == -1) {
                System.out.println("Game ended.");
                break;
            }

            int fromCol = sc.nextInt();
            int toRow = sc.nextInt();
            int toCol = sc.nextInt();

            Position from = new Position(fromRow, fromCol);
            Position to = new Position(toRow, toCol);

            board.movePiece(from, to);
            System.out.println();
        }

        sc.close();
    }
}
