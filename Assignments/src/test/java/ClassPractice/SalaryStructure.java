package ClassPractice;

import java.util.Scanner;

public class SalaryStructure {
    public static void main(String[] args) {
        System.out.println("Enter the role");
        System.out.println("Enter the no of working days");
        Scanner sc= new Scanner(System.in);
        String role= sc.next();
        int workingDays= sc.nextInt();
        if (role.equals("Manager"))
        {
            System.out.println(workingDays*500);
        }
        else if (role.equals("Staff"))
        {

                System.out.println(workingDays*350);
        }
        else if (role.equals("Clerk"))
        {
            System.out.println(workingDays*200);
        }
        else
        {
            System.out.println("Invalid Input");
        }


    }
}



