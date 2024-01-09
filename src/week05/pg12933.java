package week05;

import java.util.Arrays;

public class pg12933 {
    public long solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");

        Arrays.sort(arr);

        String sortStr = "";
        for (int i= arr.length-1; i>=0; i--) {
            sortStr += arr[i];
        }
        return Long.parseLong(sortStr);
    }

    public static void main(String[] args) {
        pg12933 dd = new pg12933();
        dd.solution(118372);
    }

}
