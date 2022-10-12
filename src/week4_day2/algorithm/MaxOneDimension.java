package week4_day2.algorithm;

public class MaxOneDimension {

    // arr을 받아서 최대값을 구해서 int로 리턴함
    /*
    return : maxValue(최대값), maxIdx(최대값 인덱스)
     */
    public int[] getMax(int[] arr) {

        int maxIdx = 0;
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        //loop 구성
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        MaxOneDimension maxOneDimension = new MaxOneDimension();

        int result[] = maxOneDimension.getMax(arr);
        if (result[0] == -3 && result[1] == 0) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result:" + result);
        }
        System.out.println("maxValue = " + result[0]);
        System.out.println("maxIdx = " + result[1]);
    }
//
//    출력
//    maxValue = -3
//    maxIdx = 0
}
