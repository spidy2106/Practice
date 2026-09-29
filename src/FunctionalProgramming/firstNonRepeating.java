package FunctionalProgramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeating {
    static void main() {

       String str = "Suvsam";

       Map<Character,Long> mp = str.chars().mapToObj(c->(char)c)
               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

         mp.entrySet().stream().filter(c -> c.getValue() == 1)
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .ifPresent(System.out::println);



    }
}
