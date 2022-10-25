package week8hwharshitpatel;
/* 15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *        */

import java.util.Scanner;

public class OO_15_LeftAngleTriangle {
    public static void main(String[] args) {
        leftTriangle();
    }

    public static void leftTriangle() {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int k = scan.nextInt();
        scan.close();
        for (a = 0; a < k; a++) {

            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }

            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
