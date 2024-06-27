package session13.exercise;

import java.util.*;

public class BT2 {
    public static void main(String[] args) {
//        B1: Khai báo mảng chứa các phần tử và tạo HashMap để lưu trữ các phần tử duy nhất.
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 3, 1, 3, 5, 6, 4));
        Map<Integer, Integer> uniqueNumber = new HashMap<>();
//        B2: Duyệt từng phần tử trong mảng và kiểm tra xem phần tử đó đã có trong HashMap hay chưa.
        for (Integer num : arr) {
            if (uniqueNumber.containsKey(num)) uniqueNumber.put(num, uniqueNumber.get(num) + 1);
            else uniqueNumber.put(num, 1);
        }
//B3: Duyệt qua các phần tử trong HashMap và lưu trữ các phần tử có giá trị bằng 1 vào một mảng mới.
        Set<Integer> keySet = uniqueNumber.keySet();
        Set<Integer> valueUnique = new HashSet<>();
        for (Integer key : keySet) {
            if (uniqueNumber.get(key) == 1) valueUnique.add(key);
        }
//        B4: In ra các phần tử duy nhất.
        System.out.println(valueUnique);

    }
}
