package DSandA;

import java.awt.*;

public class MainLienear {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 11, 44, 6, 8, 9};
        int index = LinearSearch(array , 4);

        if( index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
    private static int LinearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }

        }
        return -1;
    }

}
