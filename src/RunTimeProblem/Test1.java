package RunTimeProblem;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        System.out.println("Исходная часть массива: " + Arrays.toString(nums));

        for(int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }
    }
}
