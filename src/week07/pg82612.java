package week07;


public class pg82612 {

    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        long result = 0;

        for (int i=1; i<=count; i++) {
            totalPrice += price*i;
        }
        if (totalPrice <= money){
            return 0;
        }else {
            return result = totalPrice - money;
        }
    }

    public static void main(String[] args) {
        pg82612 dd = new pg82612();
        dd.solution(3,20,4);

    }
}
