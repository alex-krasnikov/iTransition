package itra.thirdTask;

public class Validator {
    public boolean isUserMoveValid(int userMove, int moveQuantity){
        return userMove >= 0 && userMove <= moveQuantity;
    }
}
