package week08;

import java.util.*;

public class pg12906 {

    public int[] solution(int[] arr){
        List<Integer> arrList = new ArrayList<Integer>();
        int num = -1;
        for (int i : arr) {
            if (num != i) {
                arrList.add(i);
                num = i;
            }
        }
        int[] answer = new int[arrList.size()];
        for (int k=0; k< arrList.size(); k++) {
            answer[k] = arrList.get(k);
        }
        return answer;
    }

    public static void main(String[] args) {
        pg12906 dd = new pg12906();
        dd.solution(new int[]{1,1,3,3,0,1,1});
    }
}
