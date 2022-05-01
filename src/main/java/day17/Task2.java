package day17;

public class Task2 {
    public static void main(String[] args) {
        String[][] placement = {{ChessPiece.ROOK_BLACK.getName(), ChessPiece.EMPTY.getName(), ChessPiece.EMPTY.getName(), ChessPiece.EMPTY.getName(), ChessPiece.EMPTY.getName(), ChessPiece.ROOK_BLACK.getName(), ChessPiece.KING_BLACK.getName(), ChessPiece.EMPTY.getName()},
                                {ChessPiece.EMPTY.getName(), ChessPiece.ROOK_WHITE.getName(), ChessPiece.EMPTY.getName(), ChessPiece.EMPTY.getName(), ChessPiece.PAWN_BLACK.getName(), ChessPiece.PAWN_BLACK.getName(), ChessPiece.EMPTY.getName(), ChessPiece.PAWN_BLACK.getName()},
                                {ChessPiece.PAWN_BLACK.getName(), ChessPiece.EMPTY.getName(), ChessPiece.KNIGHT_BLACK.getName(), ChessPiece.EMPTY.getName(), ChessPiece.EMPTY.getName(), ChessPiece.EMPTY.getName(), ChessPiece.PAWN_BLACK.getName(), ChessPiece.EMPTY.getName()},
                                {ChessPiece.QUEEN_BLACK.getName(), ChessPiece.EMPTY.getName(), ChessPiece.EMPTY.getName(), ChessPiece.BISHOP_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName()},
                                {ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(), ChessPiece.BISHOP_BLACK.getName(),ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName()},
                                {ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(), ChessPiece.BISHOP_WHITE.getName(),ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName()},
                                {ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.QUEEN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.PAWN_WHITE.getName()},
                                {ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.ROOK_WHITE.getName(),ChessPiece.KING_WHITE.getName(), ChessPiece.EMPTY.getName()}};

        ChessBoard board = new ChessBoard(placement);
        board.print();
    }
}
