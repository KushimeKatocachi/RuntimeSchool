package RunTimeProblem;

import java.util.Arrays;
import java.util.List;

public class ArraysProblem {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        int posotiveCount = 0;
        int negativeCount = 0;

        for (int x = 1; x < nums.length - 1; x++) {
            if (nums[x] > 0) {
                posotiveCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("Количество положительных элементов: " + posotiveCount);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
    }


}

