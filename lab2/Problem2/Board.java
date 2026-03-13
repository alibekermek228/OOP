package Problem2;

public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
    }

    public void initialize() {
        // White pieces
        board[0][0] = new Rook(new Position(0, 0));
        board[0][1] = new Knight(new Position(0, 1));
        board[0][2] = new Bishop(new Position(0, 2));
        board[0][3] = new Queen(new Position(0, 3));
        board[0][4] = new King(new Position(0, 4));
        board[0][5] = new Bishop(new Position(0, 5));
        board[0][6] = new Knight(new Position(0, 6));
        board[0][7] = new Rook(new Position(0, 7));

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1, i));
        }
    }

    public void printBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean isInsideBoard(Position p) {
        return p.row >= 0 && p.row < 8 && p.col >= 0 && p.col < 8;
    }

    public boolean movePiece(Position from, Position to) {
        if (!isInsideBoard(from) || !isInsideBoard(to)) {
            System.out.println("Position is outside the board!");
            return false;
        }

        Piece piece = board[from.row][from.col];

        if (piece == null) {
            System.out.println("No piece at the starting position!");
            return false;
        }

        if (!piece.isLegalMove(to)) {
            System.out.println("Illegal move for this piece!");
            return false;
        }

        board[to.row][to.col] = piece;
        board[from.row][from.col] = null;
        piece.setPosition(to);

        System.out.println("Move completed.");
        return true;
    }
}
