package itra.thirdTask;

public class GameRound {
    private String[] moves;
    private String HMAC;
    private String HKEY;
    private int userMove;
    private int computerMove;
    private String winner;

    public GameRound(String[] moves) {
        this.moves = moves;
    }

    public String getHMAC() {
        return HMAC;
    }

    public void setHMAC(String HMAC) {
        this.HMAC = HMAC;
    }

    public String getHKEY() {
        return HKEY;
    }

    public void setHKEY(String HKEY) {
        this.HKEY = HKEY;
    }

    public int getUserMove() {
        return userMove;
    }
    public String getStringUserMove(){
        return moves[userMove - 1];
    }

    public void setUserMove(int userMove) {
        this.userMove = userMove;
    }

    public int getComputerMove() {
        return computerMove;
    }
    public String getStringComputerMove(){
        return moves[computerMove - 1];
    }

    public void setComputerMove(int computerMove) {
        this.computerMove = computerMove;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
