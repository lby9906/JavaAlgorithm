package week04;

import java.util.Scanner;
import java.util.StringTokenizer;

public class bj1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();
        System.out.println(count);
    }
}
