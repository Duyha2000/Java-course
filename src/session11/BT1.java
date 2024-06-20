package session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(6, 1, 3, 4, 5));
        //  Add 10 elements
        System.out.println("Thêm các phần tử vào mảng: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " :");
            int number = (int) (Math.random() * 1000);
            arr.add(number);
        }

//
        int maxNumber = Collections.max(arr);
        System.out.println(maxNumber);
//
        int minNumber = Collections.min(arr);
        System.out.println(minNumber);
//
        Collections.sort(arr);
//
        List<Integer> arr2 = new ArrayList<>();
        arr2.addAll(arr);
        System.out.println(arr2);
    }
}
