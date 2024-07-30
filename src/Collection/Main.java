package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Framework Collections: cung cấp các kiến trúc để lưu trữ các class và interface, để quản lý nhóm đối tượng
// -> Thêm, sửa, xóa, sắp xếp các phần tử
// Các thành phần của Java collection
//    1. Interface: kiểu dữ liệu trừu tượng. 1 hệ thống dữ liệu phân cấp trong lập trình hướng đối tượng
//    2. Class: được triển khai từ interface cha và tể hiện kiểu dữ liệu cụ thể. VD: ArrayList, Linked List, Vector được kế thừa từ Interface List
//    3. Algorithm: giúp giải các thuật toán trong các phương thức
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 4, 65, 4));
// 1.  Collections: nằm trong gói java.util, cung cấp các phương thức để lm các bài toán liên quan sort, reverse, binarySearch
        Collections.sort(arr);
        Collections.reverse(arr);

// 2. Collection: root interface, cung cấp các phương thức cơ bản cho các loại tập hơn (List, Queue, Set)
        System.out.println(arr);

//        • Các phương thức trong interface Collection
//     1. add(T t)
        Collection<Integer> arrCollection = new ArrayList<>(Arrays.asList(1, 3, 4, 65, 4));
        arrCollection.add(5);
        arrCollection.add(3);
//        2. addAll(Collection c)
        Collection<Integer> arrCollection2 = new ArrayList<>(Arrays.asList(1, 3, 4, 65, 4));
        arrCollection2.addAll(arrCollection);
//        3. remove(T t): xóa đi phần tử đầu tiên:
        arrCollection.remove(1);
        System.out.println(arrCollection + "a");
        // 4. int size()
        System.out.println(arrCollection.size());

        // 5. clear:
        arrCollection.clear();
        System.out.println(arrCollection);

//        List Interface: được kế thừa từ interface Collection.
        // Có những phương thuwsc ( thêm , sửa, xóa) -> ArrayList, LinkedList, Vector.
        // - - - - - - ! - - - -
        //         -
        List<Integer> arr3 = new LinkedList<>();

    }
}
