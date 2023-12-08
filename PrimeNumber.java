package Day6_LogicalProgram_PP;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number"); //6
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factor = 0;
        for(int i = 1; i<=num; i++)
        {
            if(num%i == 0)
            {
                factor++;
            }
        }
        if(factor == 2)
        {
            System.out.println("Given number " + num + " is a prime number");
        }
        else
        {
            System.out.println("Given number " + num + " is not a prime number");
        }
    }
}
