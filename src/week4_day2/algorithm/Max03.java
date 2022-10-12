package week4_day2.algorithm;

public class Max03 {

    public int getMax(int[] arr) {

        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        //loop 구성
        for (int i = 1; i < arr.length; i++) {
            boolean isSth = arr[i] > maxValue;

            if (isSth) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        MaxAndMin maxAndMin = new MaxAndMin();
    }

    //출력 테스트 통과 했습니다.
}
