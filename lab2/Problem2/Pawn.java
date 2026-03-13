package Problem2;

public class Pawn extends Piece {

    public Pawn(Position position) {
        super(position, 'P');
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        if (position.row == newPosition.row && position.col == newPosition.col) {
            return false;
        }

        return newPosition.col == position.col && newPosition.row == position.row + 1;
    }
}
