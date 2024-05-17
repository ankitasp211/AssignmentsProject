import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseAStringCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse");
        String s = sc.next();
        char [] ch = s.toCharArray();
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for(Character ch1: ch) {
            l1.add(ch1);
            l2=l1.reversed();
        }
        System.out.println(l1);
        System.out.println(l2);
            StringBuilder builder = new StringBuilder();
            for(Character ch2: l2)
            {
                builder.append(ch2);
            }
        System.out.println(builder);








        }

    }

