package week05;

import java.util.Arrays;

public class pg12933 {

    public pg12933() {
    }

    public long solution(long n) {
        long answer = 0;
        long num = n;
        String str = String.valueOf(num);
        String[] arr = str.split("");

        Arrays.sort(arr);

        String sortStr = "";
        for (int i= arr.length-1; i>=0; i--) {
            sortStr += arr[i];
        }

        answer = Long.parseLong(sortStr);

        return answer;
    }

    public static void main(String[] args) {
        pg12933 dd = new pg12933();
        dd.solution(118372);

    }

}
