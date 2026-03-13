package Problem2;

public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position, 'B');
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        if (position.row == newPosition.row && position.col == newPosition.col) {
            return false;
        }
        return Math.abs(position.row - newPosition.row) == Math.abs(position.col - newPosition.col);
    }
}
