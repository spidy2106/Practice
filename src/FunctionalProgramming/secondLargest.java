package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int a = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElseThrow(()-> new RuntimeException("No second largest element found"));

        System.out.println(a);
    }
}
