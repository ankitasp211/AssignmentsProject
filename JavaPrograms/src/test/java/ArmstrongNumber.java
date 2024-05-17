import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;



public class ArmstrongNumber {

    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to find if it is an armstrong number");
        int num1 = sc.nextInt();
        int num = num1;
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        List<Integer> l3 = new ArrayList<Integer>();
        while(num!=0) {

           int reminder = (int) (num%10);
           num = num/10;
           l1.add(reminder);
           l2.add(num);
        }
//        System.out.println(l1);
//        System.out.println(l2);
        l3= l1.reversed();
//        System.out.println(l3);
        int totalSum = 0;
//        System.out.println(l3);
//        System.out.println(l2.size());
        for (int i = 0; i<l3.size(); i++)
        {
            int size = l3.size();
            totalSum = (int) (totalSum + Math.pow(l3.get(i),size));

        }
       // System.out.println(totalSum);
        if(Objects.equals(num1, totalSum))
        {
            System.out.println("The number is an ArmStrong number");
        }
        else
        {
            System.out.println("The number is not an ArmStrong number");
        }
    }


}
