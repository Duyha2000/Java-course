package session13.exercise;

import java.util.*;

public class BT1 {
    public static void main(String[] args) {
//        B1: Khai bảo mảng hoặc list phần từ với bất kỳ kiểu dữ liệu nào
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 1, 1, 4, 3));
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> keySet = map.keySet();
//B2: Duyệt từng phần tử trong mảng và kiểm tra xem phần tử đó đã có trong HashMap hay chưa rồi put vào hashmap.
        for (Integer number : arr) {
            if (!map.containsKey(number)) map.put(number, 1);
            else map.put(number, map.get(number) + 1);
        }
//        B3: Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử.
        for (Integer key : keySet) System.out.println(key + " " + map.get(key));
    }
}
