package week8hwharshitpatel;
/*6. Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
*/

import java.util.Scanner;

public class FF_6_NumberTriangle {

    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            for (int h = 1; h <= i; h++) {
                System.out.print(h);
            }
            System.out.println();
        }
    }
}
