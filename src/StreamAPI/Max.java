package StreamAPI;

import java.util.Optional;
import java.util.stream.Stream;

public class Max {
    public static void main(String[] args) {

        int[] nums = {222,44, 23, 3223};
        int maxIn = 0;

        for (int num : nums) {
            if(num > maxIn ) {
                maxIn = num;
            }
        }
        System.out.println(maxIn);


        Optional<Integer> max = Stream.of(22,232,2332).reduce(Math :: max);
        System.out.println(max.get());
    }
}
