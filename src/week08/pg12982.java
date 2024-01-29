package week08;

import java.util.Arrays;

public class pg12982 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        for (int i=0; i<d.length; i++){
            answer += d[i];
            if (answer <= budget){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        pg12982 dd = new pg12982();
        dd.solution(new int[]{1,3,2,5,4}, 9);
    }
}
