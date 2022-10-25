package week8hwharshitpatel;
/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/


import java.util.Scanner;

public class LL_12_PrimeNumber {

    public static void main(String[] args) {

        prime();

    }

    public static void prime() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number = sc.nextInt();
        sc.close();
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is a non-prime number");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

}
