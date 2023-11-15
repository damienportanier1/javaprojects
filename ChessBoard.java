//instantiable part
public class ChessBoard {
    public enum PieceType {
        PAWN,
        KNIGHT,
        BISHOP,
        ROOK,
        QUEEN,
        KING
    }

    public static class Piece {
        private PieceType type;
        private boolean isWhite;

        public Piece(PieceType type, boolean isWhite) {//constructor
            this.type = type;
            this.isWhite = isWhite;
        }

        public PieceType getType() {//getter
            return type;
        }

        public boolean isWhite() {//getter
            return isWhite;
        }
    }
	//app part
    public static void main(String[] args) {
        Piece[][] board = new Piece[8][8];//two dimensional array
        // Initialize white pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Piece(PieceType.PAWN, true);
        }
        // Initialize white major pieces
        board[0][0] = new Piece(PieceType.ROOK, true);
        board[0][1] = new Piece(PieceType.KNIGHT, true);
        board[0][2] = new Piece(PieceType.BISHOP, true);
        board[0][3] = new Piece(PieceType.QUEEN, true);
        board[0][4] = new Piece(PieceType.KING, true);
        board[0][5] = new Piece(PieceType.BISHOP, true);
        board[0][6] = new Piece(PieceType.KNIGHT, true);
        board[0][7] = new Piece(PieceType.ROOK, true);
        // Initialize black pawns
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Piece(PieceType.PAWN, false);
        }
        // Initialize black major pieces
        board[7][0] = new Piece(PieceType.ROOK, false);
        board[7][1] = new Piece(PieceType.KNIGHT, false);
        board[7][2] = new Piece(PieceType.BISHOP, false);
        board[7][3] = new Piece(PieceType.QUEEN, false);
        board[7][4] = new Piece(PieceType.KING, false);
        board[7][5] = new Piece(PieceType.BISHOP, false);
        board[7][6] = new Piece(PieceType.KNIGHT, false);
        board[7][7] = new Piece(PieceType.ROOK, false);

        // Print the chessboard
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("N ");
                } else {
                    System.out.print(board[i][j].getType() + " ");
                }
            }
            System.out.println();
        }
    }
}
