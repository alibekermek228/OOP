package Problem2;

public class Rook extends Piece {

    public Rook(Position position) {
        super(position, 'R');
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        if (position.row == newPosition.row && position.col == newPosition.col) {
            return false;
        }
        return position.row == newPosition.row || position.col == newPosition.col;
    }
}