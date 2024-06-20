package Session11Backup;

import java.util.*;

public class BT1 {
    public static void main(String[] args) {
//        tạo ngẫu nhiên một List số nguyên có tối đa 10 phần tử
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1, 100);
            numbers.add(randomNumber);
        }
        System.out.println(numbers);
//
        int maxNumber = Collections.max(numbers);
        System.out.println(maxNumber);
//
        Collections.reverse(numbers);
        // Tăng dần
        Collections.sort(numbers);
        System.out.println(numbers);
        // Giảm dần
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);
        //
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 3, 4));
        numbers.addAll(numbers1);
        System.out.println(numbers);

    }
}
