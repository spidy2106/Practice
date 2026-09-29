package FunctionalProgramming;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args){

        String str = "dcba";

        str.chars().mapToObj(c->(char)c).sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

    }
}
