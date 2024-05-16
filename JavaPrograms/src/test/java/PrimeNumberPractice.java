import java.util.Scanner;

public class PrimeNumberPractice {

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to verify as a prime number");
        int num = sc.nextInt();
        int flag=0;
        if((num==0)||(num==1))
        {
            System.out.println("The number is not a prime number");
        }
       else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("The number is not a prime number");
                    flag = 1;
                    break;

                }
            }
        }
            if(flag==0)
            {
                System.out.println("The number is  a prime number");
            }
        }

    }



