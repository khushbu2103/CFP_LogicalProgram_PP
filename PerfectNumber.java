package Day6_LogicalProgram_PP;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number"); //6
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int factors = 0;
        for (int i = 1; i<num; i++) // 1,2,4,5,6
        {
            if(num%i == 0)
            {
                sum = sum + i; //1,3,
            }
        }
        if(num == sum)
            System.out.println("Given number " + num + " is a perfect number");
        else
            System.out.println("Given number " + num + " is not a perfect number");
    }
}
