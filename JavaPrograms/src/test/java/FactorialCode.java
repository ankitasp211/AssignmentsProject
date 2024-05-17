import java.util.Scanner;

public class FactorialCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial");
        long number = sc.nextLong();
        long factorial= 1;
        for(int i = 1;i<number;i++)
        {
            factorial=factorial*(number-i);
        }
        System.out.println(factorial*number);
    }
}
