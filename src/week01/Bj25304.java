package week01;

import java.util.Scanner;

public class Bj25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;

        int sum = in.nextInt();
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            int product = in.nextInt();
            int count = in.nextInt();
            total += (product * count);
        }
        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
