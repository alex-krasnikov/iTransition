package itra.thirdTask;

public class Validator {
    public boolean isUserMoveValid(int userMove, int moveQuantity) {
        return userMove >= 0 && userMove <= moveQuantity;
    }

    public boolean isMovesValid(String[] moves) {
        if (moves.length < 2 || moves.length % 2 == 0) {
            return false;
        }
        for (int i = 0; i < moves.length - 1; i++) {
            for (int j = i + 1; j < moves.length; j++) {
                if (moves[i].equals(moves[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
