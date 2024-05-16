import java.io.InputStream;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find is a prime number");
        int num = sc.nextInt();
        int flag = 0;
        if ((num == 0) || (num == 1)) {
            System.out.println("The number is not a prime number");
        } else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {

                    flag++;

                }
            }
            if (flag> 1) {
                System.out.println("The number is not a prime number");
            }
                else{
                System.out.println("The number is a prime number");

                }



            }
        }

    }











