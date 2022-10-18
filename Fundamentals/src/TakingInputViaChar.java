import java.util.Scanner;

public class TakingInputViaChar {

    public static void main (String args[]){

        Scanner s = new Scanner(System.in);

        String str = s.next();

        char ch = str.charAt(0);
//        here char means character, charAT means character at that particular number (index, here we took zero for ex).
//        index starts from "0" in java (i:e first character index will be zero not one).
        System.out.println(ch);


    }
}
