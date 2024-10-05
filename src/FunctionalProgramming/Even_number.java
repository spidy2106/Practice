package FunctionalProgramming;

import java.util.List;

public class Even_number {
    public static void main(String[] args) {

        List<Integer> li = List.of(1,2,3,4,5,6,7,8,10);

        li.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
