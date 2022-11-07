package week5_day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ZeroArray {

    public Integer[] solution(int[] arr, int divisor) {
        Integer[] answer;
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                nums.add(arr[i]);
            }
        }
        if(nums.size()==0) nums.add(-1);
        int size = nums.size();
        answer = nums.toArray(new Integer[size]);
        Arrays.sort(answer);


        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {
        PriorityQueue<Integer> list = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
               list.add(arr[i]);
            }
        }

        if(list.size()==0) return new int[]{-1};

        int[] answer = new int[list.size()];
        int idx=0;
        while (!list.isEmpty()) {
            answer[idx++] = list.poll();
        }
        return answer;

    }
    public static void main(String[] args) {

        int arr[] = {2, 36, 1, 3};
        int divisor = 1;
        ZeroArray za = new ZeroArray();
        Integer[] solution = za.solution(arr, divisor);
        System.out.println(Arrays.toString(solution));
    }
}
