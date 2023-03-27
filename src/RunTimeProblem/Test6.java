package RunTimeProblem;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        System.out.println("Исходная часть массива: " + Arrays.toString(nums));

        for(int i = 0; i < nums.length  ;  i += 2) {
            System.out.println(nums[i]);
        }
    }
}

//Вывести чётные элементы массива по порядку (Вывести только чётные элементы
//массива по порядку (каждый второй элемент). Необходимо будет вывести второй,
//четвёртый, шестой и т.д. элементы. Позиции (индексы) для необходимых элементов:
//1, 3, 5...n (постоянное увеличение на 2)
