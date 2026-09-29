package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8};

        List<Integer> li = Arrays.stream(arr).boxed().sorted((a,b)->b-a).toList();
        System.out.println(li);
    }
}
