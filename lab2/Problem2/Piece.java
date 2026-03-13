package Problem2;

public abstract class Piece {
    protected Position position;
    protected char symbol;

    public Piece(Position position, char symbol) {
        this.position = position;
        this.symbol = symbol;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract boolean isLegalMove(Position newPosition);
}
