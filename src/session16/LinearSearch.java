package session16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int number = 6;
        System.out.println(linearSearch(arr, number)); // 2
    }

    public static int linearSearch(List<Integer> arr, int number) {
        int index = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == number) {
                index = i;
                break;
            }
        }
        return index;
    }
}
