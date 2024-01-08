package week05;

public class pg12928 {

    public pg12928() {
    }

    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        pg12928 dd = new pg12928();
        dd.solution(5);
    }
}
