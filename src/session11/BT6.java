package session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BT6 {
    public static void main(String[] args) {
        //Viết một chương trình Java để xóa các phần tử trùng lặp trong một List các số nguyên.
        List<Integer> arr = new ArrayList<>(Arrays.asList(6, 5, 5, 4, 5));
//        C1: Dùng Set
//        Set<Integer> arr2 = new HashSet<>();
//        arr2.addAll(arr);
        List<Integer> arr2 = new ArrayList<>();
        for (Integer number : arr) {
            if (!arr2.contains(number)) arr2.add(number);
        }

        System.out.println(arr2);
    }
}
