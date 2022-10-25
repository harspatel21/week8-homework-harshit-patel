package week8hwharshitpatel;
/*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

import java.util.Scanner;

public class II_9_FibonacciNumber {
    public void fibonacci() {
        int num, firstNum = 0, secondNum = 1;
        System.out.print("Enter number: ");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        System.out.println("Fibonacci Series till " + num + " numbers:");
        scn.close();
        for (int i = 1; i <= num; ++i) {
            System.out.print(firstNum + ", ");

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    public static void main(String[] args) {
        II_9_FibonacciNumber obj = new II_9_FibonacciNumber();
        obj.fibonacci();
    }
}
