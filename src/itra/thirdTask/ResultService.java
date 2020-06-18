package itra.thirdTask;

public class ResultService {
    public String compareResults(int computerMove, int userMove, int movesQuantity){
        int halveMoves = (movesQuantity + 1) / 2;
        if (userMove - computerMove == 0){
            return "Friendly";
        }
        if (userMove <= halveMoves){
            return computerMove > userMove && computerMove < userMove + halveMoves ?
                    "Computer" : "User";
        }
        return computerMove < userMove && computerMove > userMove - halveMoves ?
                "User" : "Computer";
    }
}
