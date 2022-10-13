package week4_day3.algorithm;

public class BubbleSort01 {

    public int[] sort(int[] ar) {

        for (int j = 1; j < ar.length; j++) {
            if (ar[0] > ar[j]) {
                int tmp = ar[0];
                ar[0] = ar[j];
                ar[j] = tmp;
            }
        }

        return ar;
    }

    public static void main(String[] args) {

        BubbleSort01 br = new BubbleSort01();
        int[] ar = new int[]{2, 7, 3, 9, 28, 11};
        int[] sorted = br.sort(ar);

        for (int i : sorted) {
            System.out.print(" " + i);
        }
    }
}
// 출력
// 2 7 3 9 28 11
