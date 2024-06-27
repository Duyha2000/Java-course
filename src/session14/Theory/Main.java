package session14.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        System.out.println(countNumberPositive(arr));
        List<String> list = new ArrayList<>(Arrays.asList("Toan", "Ly", "Hoa"));
        list.forEach(System.out::println);
    }

    public static long countNumberPositive(List<Integer> arr) {
        //        return arr.stream()
//                .reduce(0, Integer::sum);
        return arr.stream().filter(num -> num % 2 == 0).count();
    }
}
