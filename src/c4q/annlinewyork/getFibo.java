package c4q.annlinewyork; /**
 * Created by c4q-nali on 3/19/15.
 */
import java.util.Scanner;
public class getFibo {
    public static void main (String [] args){
        int a =1, b =1, c =0;

        System.out.println("Please enter an integer. ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i=0 ; i <= input; i++){
            c =a +b;
            a =b;
            b =c;

            System.out.print(c);

            if ((i+2)%5 == 0);
            System.out.println();
        }
    }
}
