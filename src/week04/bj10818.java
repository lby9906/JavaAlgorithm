package week04;

import java.util.Arrays;
import java.util.Scanner;

public class bj10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];

        for (int i=0; i<array.length; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length-1];

        System.out.println(min);
        System.out.println(max);
    }
}
