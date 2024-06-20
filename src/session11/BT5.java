package session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BT5 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(6, 1, 3, 4, 5));
        List<Integer> arr2 = new ArrayList<>();
        for (Integer number : arr) {
            if (number % 2 == 0) arr2.add(number);
        }
        System.out.println(arr2);
    }
}
