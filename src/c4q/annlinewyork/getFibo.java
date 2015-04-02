package c4q.annlinewyork;

/**
 * Created by c4q-nali on 3/19/15.
 */
import java.util.Scanner;
public class GetFibo {

    public static long fibonacci (long num){
        int first = 0;
        int second =1;
        int result = first+second;

        if (num <1) {
            System.out.println("Not a correct input.");
            return 0;
        }

        for (int i =1; i<=num; i++){
            if (num==1){
                return 0;
            }
            else if (num==2){
                return 1;
            }
            else if (i>=3){
                result=first+second;
                first=second;
                second=result;
            }
        }
        return result;
    }
    public static void main (String [] args){
        System.out.println(fibonacci(8));
    }
}
