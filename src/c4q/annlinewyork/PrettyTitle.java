package c4q.annlinewyork;

/**
 * Created by c4q-nali on 3/20/15.
 */

import java.util.Scanner;

public class PrettyTitle {

    public static String capitalize(String title){

        String result = "";
        String word;

        Scanner input = new Scanner(title);
        while (input.hasNext()) {
            word = input.next();
            result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";

            //word = Character.toUpperCase(word.charAt(0)) + word.substring(1,word.length()-1);

        }


        return result;
    }


    public static void prettyTitle(String title, char symbol){


        System.out.println(title);



        for (int i=0; i<title.length(); i++) {
            if (title.charAt(i) == ' ')
                System.out.print(" ");
            else
                System.out.print(symbol);

        }

        System.out.println();
    }


    public static void main (String[] args){

        prettyTitle(capitalize("a tale of two cities"), '*');




    }
}
