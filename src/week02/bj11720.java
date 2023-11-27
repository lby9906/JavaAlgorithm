package week02;

import java.util.Scanner;

public class bj11720 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("숫자의 개수를 입력하세요 : ");
        int num = in.nextInt();

        System.out.println("원하는 숫자를 입력하세요 : ");
        String[] arr = new String[num];
        String str = in.next();
        String[] arrSplit = str.split("");
        for (int i=0; i< arrSplit.length; i++) {
            arr[i] = arrSplit[i];
            int change = Integer.parseInt(arr[i]);
            sum += change;
        }
        System.out.println(sum);
    }
}

