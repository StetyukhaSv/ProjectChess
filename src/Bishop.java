public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessboard, int line, int column, int toLine, int toColumn) {
        if((toLine >= 0 && toLine < 8) & (toColumn >= 0 && toLine < 8)) {
            if(!(toLine == line && toColumn == column)) {
                if(Math.abs(toLine - line) == Math.abs(toColumn - column)) {
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    public String getSymbol() {
        return "B";
    }
}
