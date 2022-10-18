import java.util.Scanner;
//it defines that scanner is imported through java and util (utility), this contain collection of various java collections, frameworks etc.

public class AddTwoNumbersByTakingInput {
    public static void main (String args[]) {

        int a,b;

        Scanner s = new Scanner(System.in);
//        "Scanner" is used to take input
//        here "s" is variable with type "scanner"
//        "System.in" defines that scan has to be done via input

        a = s.nextInt();
        b = s.nextInt();
//        here s.next define next input to be scanned and it means it should be integer.
//        if a give input of something else (say char (i:e "abcd") then it will throw error of input mismatched.
//        you can also use like this
//        s.nextLong();
//        s.nextDouble(); etc
        int c = a+b;
        System.out.println(c);

        String str = s.next();
//        it will print 1st word of a line
        System.out.println(str);
        String str1 = s.nextLine();
//        it will print complete line
        System.out.println(str1);
//        note - this s.nextLine is giving logical error here
//        because of s.next(), its taking input from there and directly giving output, hence you may not see complete output
//        Code is correct you can verify this by just commenting s.next()
    }
}
