package week06;

public class pg12935 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        int num = 0;
        if (arr.length == 1){
            return new int[]{-1};
        }
        for (int i : arr) {
            if (min > i){
                min = i;
            }
        }
        for (int a : arr) {
            if (min != a){
                answer[num++] = a;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        pg12935 dd = new pg12935();
        dd.solution(new int[]{1,2,3,4});
    }
}
