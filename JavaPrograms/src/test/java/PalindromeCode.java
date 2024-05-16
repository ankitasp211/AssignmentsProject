import javax.print.DocFlavor;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeCode {

    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string you want to find whether it is palindrome");

        String a= sc.next();
        String b = "";
        char [] ch = a.toCharArray();
        int size = ch.length;
        for(int i=0; i<size;i++)
        {
        System.out.println(ch[i]);
        b=ch[i]+b;
        }

        if(b.equals(a))
        {
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is palindrome");
        }

}
}

