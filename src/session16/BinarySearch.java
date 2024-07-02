package session16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int number = 5;
        int index = Collections.binarySearch(arr, number); // Java collection

        System.out.println(index);
        System.out.println(binarySearch(arr, number));
    }

    public static int binarySearch(List<Integer> arr, int number) {
        int index = -1;
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr.get(mid) == number) index = mid;

            if (arr.get(mid) > number) right = mid - 1;
            else left = mid + 1;
        }

        return index;
    }
}
