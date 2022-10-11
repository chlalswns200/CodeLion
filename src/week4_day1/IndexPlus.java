package week4_day1;

public class IndexPlus {
    // 문자열 풀이 대용량 처리시 안좋음
    private static void getAnswer(int n, int answer) {
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int numericValue = Character.getNumericValue(c);
            answer += numericValue;
        }

        System.out.println("sum = " + answer);
    }

    public int solution(int n) {
        //연산 몫과 나머지를 이용한 풀이 방법
        // 대량 연산 시에도 문자열을 사용하는 방법보다 처리속도가 빠르다
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n = n / 10;
        }
        return result;
    }
    public static void main(String[] args) {

        IndexPlus indexPlus = new IndexPlus();

        int n = 123;
        int answer = 0;

        indexPlus.getAnswer(n,answer);
        int solution = indexPlus.solution(123);
        System.out.println("solution = " + solution);
    }

}
