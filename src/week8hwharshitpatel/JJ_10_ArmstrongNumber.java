package week8hwharshitpatel;
/*10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/

import java.util.Scanner;

public class JJ_10_ArmstrongNumber {
    public static void main(String[] args) {
        armstrong();
    }

    public static void armstrong() {

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter any number number : ");

        int number = scn.nextInt(), originalNumber, remainder, result = 0, n = 0;


        for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n) ;

        for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
