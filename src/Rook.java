public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessboard, int line, int column, int toLine, int toColumn) {
        if((toLine >= 0 && toLine < 8) && (toColumn >= 0 && toColumn < 8)) {
            if(!(line == toLine && column == toColumn)) {
                if(line == toLine || column == toColumn) {
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    public String getSymbol() {
        return "R";
    }
}
