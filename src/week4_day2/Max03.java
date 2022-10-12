package week4_day2;

public class Max03 {

    public int getMax(int[] arr) {
        int maxValue = 0;
        //loop 구성
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        Max03 max02 = new Max03();

        int result = max02.getMax(arr);
        if (result == 85) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result:" + result);
        }
    }
}
