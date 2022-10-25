package week8hwharshitpatel;
/*8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
*/

import java.util.Scanner;

public class HH_8_RightAngleTriangle {
    public static void main(String[] args) {
        rTriangle();
    }

    public static void rTriangle() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            for (int h = 1; h <= i; h++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
