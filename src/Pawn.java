public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int start;
        int finish;
        if(getColor().equals("Black")) {
            finish = - 1;
            start = 6;
        }
        else if(getColor().equals("White")) {
            finish = 1;
            start = 1;
        }
        else {
            return false;
        }
        if((toColumn >= 0 && toColumn < 8) && (toLine >= 0 && toLine < 8)) {
            if(!(line == toLine && column == toColumn)) {
                if(column == toColumn) {
                    if(line + 2 * finish == toLine && line == start) {
                        return true;
                    }
                    else {
                        return line + finish == toLine;
                    }
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    public String getSymbol() {
        return "P";
    }
}
