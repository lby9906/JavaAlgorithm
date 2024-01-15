package week06;

public class pg12948 {

    public String solution(String phone_number) {
        String endNumber = "";
        String str = "";
        for (int i=phone_number.length()-1; i>0; i--) {
            endNumber = phone_number.substring(phone_number.length()-4);
        }
        for (int i=0; i<phone_number.length()-endNumber.length(); i++) {
            str += "*";
        }
        return str.concat(endNumber);
    }

    public static void main(String[] args) {
        pg12948 dd = new pg12948();
        dd.solution("01033334444");
    }
}
