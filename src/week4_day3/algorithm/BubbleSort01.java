package week4_day3.algorithm;

public class BubbleSort01 {

    public int[] sort(int[] ar) {

        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                }
            }
        }

        return ar;
    }

    public static void main(String[] args) {

        BubbleSort01 br = new BubbleSort01();
        int[] ar = new int[]{2, 7, 3, 9, 28, 11,1};
        int[] sorted = br.sort(ar);

        for (int i : sorted) {
            System.out.print(" " + i);
        }
    }
}
// 출력
// 2 7 3 9 28 11
