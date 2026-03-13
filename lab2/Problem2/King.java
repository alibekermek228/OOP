package Problem2;

public class King extends Piece {

    public King(Position position) {
        super(position, 'K');
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        if (position.row == newPosition.row && position.col == newPosition.col) {
            return false;
        }

        int rowDiff = Math.abs(position.row - newPosition.row);
        int colDiff = Math.abs(position.col - newPosition.col);

        return rowDiff <= 1 && colDiff <= 1;
    }
}
