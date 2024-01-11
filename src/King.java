public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessboard, int line, int column, int toLine, int toColumn) {
        if((toLine >= 0 && toLine < 8) && (toColumn >= 0 && toColumn < 8)) {
            if(!(line == toLine && column == toColumn)) {
                if((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1) || (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0)
                        || (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 1)) {
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    public boolean isUnderAttack(ChessBoard chessboard, int line, int column) {
        boolean isTrue = false;
        for(int i = 0; i < 8; i++) {
            for(int y = 0; y < 8; y++) {
                if(chessboard.board[i][y] != null) {
                    if((!chessboard.board[i][y].getColor().equals(color)) && chessboard.board[i][y].canMoveToPosition(chessboard, i, y, line, column)) {
                        isTrue = true;
                    }
                }
            }
        }
        return isTrue;
    }

    public String getSymbol() {
        return "K";
    }
}
