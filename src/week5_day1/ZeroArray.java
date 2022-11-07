package week5_day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static void main(String[] args) {

        int arr[] = {2, 36, 1, 3};
        int divisor = 1;
        ZeroArray za = new ZeroArray();
        Integer[] solution = za.solution(arr, divisor);
        System.out.println(Arrays.toString(solution));
    }
}
