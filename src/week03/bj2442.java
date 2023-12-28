package week03;

import java.util.Scanner;

public class bj2442 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int star = in.nextInt();
        for (int i=1; i<=star; i++) {
            for (int j=0; j < star-i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
