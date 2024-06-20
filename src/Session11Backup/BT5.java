package Session11Backup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BT5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 9, 6, 4, 4, 1, 7, 5, 9, 0));
        List<Integer> numbers2 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) numbers2.add(number);
        }
        System.out.println(numbers2);

    }
}
