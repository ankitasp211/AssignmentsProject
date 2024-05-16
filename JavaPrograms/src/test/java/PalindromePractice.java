import java.util.Scanner;

public class PalindromePractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to verify if it is a palindrome");
        String s = sc.next();
        String rev ="";
        char[] ch = s.toCharArray();
        for(Character c: ch)
        {
            System.out.println(c);
            rev=c+rev;
        }
        System.out.println(rev);

        if(rev.equals(s))
        {
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }


    }
}
