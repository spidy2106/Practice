package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findUnique {
    public static void main(String[] args){

        List<Integer> li = List.of(1,2,3,4,5,6,6,6,7,7,7,7);

        li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .forEach(System.out::println);

    }
}
