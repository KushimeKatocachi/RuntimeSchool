package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainExsample {

    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("Test1"), Arrays.asList("Test2"));
        System.out.println(list);
        list.stream().flatMap(Collection::stream).forEach(System.out::println);

        Stream.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);
        List.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);

        List<Integer> listInteger = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.toList());

        String[] words = {"hello", "world", "java"};
        String string = Arrays.stream(words).collect(Collectors.joining(" - " ));
        System.out.println(string);

        Optional<Integer> max = Stream.of(1,2000,3,4,5,6,12,123,1)
                .reduce(Math::max);
        System.out.println(max.get());



    }
}
