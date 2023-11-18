package week01;

import java.util.Scanner;

public class Bj25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        int product;
        int count;
        int total = 0;

        sum = in.nextInt();
        num = in.nextInt();
        for (int i = 0; i < num; i++) {
            product = in.nextInt();
            count = in.nextInt();
            total += (product * count);
        }
        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
