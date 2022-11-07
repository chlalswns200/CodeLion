package week5_day1;

public class SimpleSearch {

    public boolean hashad(int num) {

        int result = 0;
        int realNum = num;
        while (num > 0) {
            result += num % 10;
            num = num / 10;
        }
        if (realNum % result == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        SimpleSearch ss = new SimpleSearch();
        System.out.println(ss.hashad(11));

    }
}
