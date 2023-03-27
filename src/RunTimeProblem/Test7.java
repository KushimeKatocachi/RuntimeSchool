package RunTimeProblem;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        int  minIndex = 0;
        int  maxIndex = 0;

        System.out.println("Исходная часть массива: " + Arrays.toString(nums));

        for (int num : nums) {
            if (num > maxIndex) {
                maxIndex = num;
            }
            if (num < minIndex) {
                minIndex = num;
            }
        }
        System.out.println(maxIndex);
        System.out.println(minIndex);
    }
}

//Найти максимальный и минимальный элементы массива (Необходимо
//определить максимальный и минимальный элементы в массиве и вывести их).

