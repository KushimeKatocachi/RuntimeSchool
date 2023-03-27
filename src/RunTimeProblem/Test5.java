package RunTimeProblem;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        System.out.println("Исходная часть массива: " + Arrays.toString(nums));

        for(int i = nums.length - 3; i < nums.length  ;  i++) {
            System.out.println(nums[i]);
        }
    }
}
//Вывести все элементы кроме первого и последнего.