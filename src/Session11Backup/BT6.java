package Session11Backup;

import java.util.*;

public class BT6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 0, 0, 4, 4, 1, 7, 5, 9, 0));
        List<Integer> numbers2 = new ArrayList<>();
        Set<Integer> numbers3 = new HashSet<>(numbers); // Set: in ra 1 mảng các phần tử k trùng lặp tăng dần
        System.err.println(numbers3);

        for (Integer number : numbers) {
            if (!numbers2.contains(number)) numbers2.add(number);
        }
        System.out.println(numbers2);
    }
}
