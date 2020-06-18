package itra.thirdTask;

public class Runner {
    private String[] moves;

    public Runner(String[] moves){
        this.moves = moves;
    }

    public void start(){
        int movesQuantity = moves.length;
        Validator validator = new Validator();
        if (!validator.isMovesValid(moves)){
            System.out.println("Moves should be different, quantity should be odd and more that 1!");
            System.exit(0);
        }
        PrintService printService = new PrintService();
        MoveService moveService = new MoveService();
        ResultService resultService = new ResultService();
        while (true) {
            GameRound gameRound = new GameRound(moves);
            gameRound.setComputerMove(moveService.makeComputerMove(movesQuantity));
            byte[] HKEY = MyHMAC.generateSafeToken(32);
            byte[] HMAC = MyHMAC.calcHmacSha256(HKEY, Integer.toString(gameRound.getComputerMove()).getBytes());
            gameRound.setHMAC(MyHMAC.bytesToHex(HMAC));
            gameRound.setHKEY(MyHMAC.bytesToHex(HKEY));
            printService.printMenu(moves, gameRound.getHMAC());
            gameRound.setUserMove(moveService.makeUserMove());
            if (gameRound.getUserMove() == 0) {
                System.out.println("Good bye!!!");
                System.exit(0);
            }
            if (!validator.isUserMoveValid(gameRound.getUserMove(), movesQuantity)){
                System.out.println("Hey! Your move incorrect! Let's play again!");
                continue;
            }
            gameRound.setWinner(resultService.compareResults(
                    gameRound.getComputerMove(),
                    gameRound.getUserMove(),
                    movesQuantity
            ));
            printService.printResults(
                    gameRound.getStringComputerMove(),
                    gameRound.getStringUserMove(),
                    gameRound.getWinner(),
                    gameRound.getHKEY());
        }
    }
}
