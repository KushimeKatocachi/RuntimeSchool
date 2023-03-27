package RunTimeProblem;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        System.out.println("Исходная часть массива: " + Arrays.toString(nums));

        for(int i = 1; i < nums.length - 1 ;  i++) {
            System.out.println(nums[i]);
        }
    }
}

// Вывести все элементы кроме первого и последнего.