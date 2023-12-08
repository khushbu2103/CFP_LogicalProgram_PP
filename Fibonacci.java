package Day6_LogicalProgram_PP;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        if(num == 1)
            System.out.println(num1);
        else if (num == 2)
            System.out.println(num1 + " " + num2+ " ");
        else
            System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i<num; i++)
        {
            sum = num1+num2; //1
            System.out.print(sum + " ");
            num1 = num2; // 1
            num2 = sum; // 1
        }
    }
}
