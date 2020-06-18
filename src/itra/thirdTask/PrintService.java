package itra.thirdTask;

public class PrintService {
    public void printMenu(String[] moves, String HMAC){
        System.out.println("HMAC: " + HMAC);
        System.out.println("Available moves:");
        for (int i = 0; i < moves.length; i++) {
            System.out.println(i + 1 + " - " + moves[i]);
        }
        System.out.println("0 - exit");
    }
    public void printResults(String computerMove, String userMove, String winner, String HKEY){
        System.out.println("You move: " + userMove);
        System.out.println("Computer move: " + computerMove);
        switch (winner){
            case "User" :
                System.out.println("You win!");
                break;
            case "Computer" :
                System.out.println("You lose!");
                break;
            case "Friendly" :
                System.out.println("Friendly game!");
                break;
        }
        System.out.println("HMAC key: " + HKEY);
        System.out.println("**********************************************************");
    }
}
