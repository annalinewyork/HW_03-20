package c4q.annlinewyork; /**
 * Created by c4q-nali on 3/19/15.
 */
import java.util.Random;
import java.util.Scanner;
public class TwentyQ {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int secretNumber = ran.nextInt(100000)+1;

        Scanner in = new Scanner(System.in);
        System.out.println("We have a secret number X, " +
                "please enter a number we'll see if you can guess it. " +
                "You have 20 times!");

        int chances = 20;

        while (chances > 0) {
            int userGuessedNumber = in.nextInt();
            chances--;
            if (userGuessedNumber > secretNumber) {
                System.out.println("This input number is higher than X. You have " + chances + " chances left.");
            } else if (userGuessedNumber < secretNumber) {
                System.out.println("This input number is lower than X. You have  " + chances + " chances left.");
            } else {
                System.out.println("You guessed it!");
                System.exit(0);
            }
        }
        if (chances == 0) {
            System.out.println("You guess over 20 times, maybe next time!, the secret number is " + secretNumber + " !");

        }

    }
}
// also I can use for loop to circle (int i = 0, i <=20, i ++)
// (i = 20, i > 0 , i--) .
// initial i outside loop can help to reuse the i.