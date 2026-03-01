import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int randomNum = gen.nextInt(10) + 1; // 1 to 10 [cite: 49]
        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Guess a number [1-10]: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Input out of range: " + guess);
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        System.out.println("The random number was: " + randomNum);
        if (guess == randomNum) {
            System.out.println("On the money!");
        } else if (guess > randomNum) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }
}