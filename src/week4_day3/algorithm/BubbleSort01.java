package week4_day3.algorithm;

public class BubbleSort01 {

    public int[] sort(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-i-1; j++) {
                if (ar[j] > ar[j+1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
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
// 2 3 7 9 11 28
