package c4q.annlinewyork; /**
 * Created by c4q-nali on 3/30/15.
 */
import java.util.Scanner;
public class PatternArt {

    public static void main(String[] args) {

        System.out.println("Please give me a number.");
        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();
        //let user input a number which used for print out a pattern, size userinput * userinput.

        int i = 1;
        int j = 1;
        //define i as row, j as column.

        for (i = 1; i <= userinput; i++) {
            for (j = 1; j <= userinput; j++) {
                if (i % j == 0 || j % i == 0) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
            //this line run the first for loop, i, everytime inside for loop j stops, the i for loop
            //will run with a new line "system.out.println", it can be seen as an ENTER key.
        }

    }
}



