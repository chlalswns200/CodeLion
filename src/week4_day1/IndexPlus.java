package week4_day1;

public class IndexPlus {
    public static void main(String[] args) {


        int n = 123;
        int answer = 0;
        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int numericValue = Character.getNumericValue(c);
            answer += numericValue;
        }
        System.out.println("sum = " + answer);
        }

}
