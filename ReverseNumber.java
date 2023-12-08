package Day6_LogicalProgram_PP;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number"); //6
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int remainder = 0;
        if(num < 10)
            System.out.println(num);
        else
        {
            while (num != 0)
            {
                remainder = num % 10;  //7;

                reverse = (reverse * 10) + remainder; //7;

                num = num / 10;
            }
            System.out.println(reverse);
        }

    }
}
