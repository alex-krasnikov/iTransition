package itra.thirdTask;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class MoveService {
    private Scanner scanner = new Scanner(System.in);
    Random random = new SecureRandom();
    public int makeUserMove(){
        System.out.println("Enter your move: ");
        return scanner.nextInt();
    }
    public int makeComputerMove(int movesQuantity){
        return random.nextInt(movesQuantity) + 1;
    }

}
