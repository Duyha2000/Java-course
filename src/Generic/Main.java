package Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person1 person1 = new Person1(1, 20);
        System.out.println(person1);

        Person2 person2 = new Person2("1", 20);

        System.out.println(person2);

        Person3 person3 = new Person3(1.0, 20);
        System.out.println(person3);
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr5 = new ArrayList<>();
        arr.add(4);
        arr.add(5);
//        arr.add("4");

//        Person<Integer> person = new Person<>(1, 20);
//        Person<String> personString = new Person<>("1", 20);
//        Person<Double> personDouble = new Person<>(1.0, 20);


//        System.out.println(person);
//        System.out.println(personString);

//        Generic: là 1 tính năng được giới thiệu cho phép định nghĩa 1 lớp hoặc interface theo các kiểu dữ liệu do chúng ta truền vào
//        QUy ước đặt tên:
//        T: Type: kiểu dữ liệu,
//        E: element: thuộc tính
//        K: key ,
//        N: number ,
//        V: value

//        Lợi ích của Generic: 1. Giúp code được tái sử dụng, thay vì tạo ra nhiều class với kiểu dữ liệu khác nhau
// Tạo ra 1 class chung và truyền kiểu dữ liệu vào
        // Giúp cho an tooàn kiểu dữ liệu
//        1 số Generic hay gặp:
        // Lớp Generic
        // Hàm generic:
        Integer[] arrInt = {1, 3, 5, 6, 7};
        String[] arrString = {"3", "a", "c", "d"};
        printArr(arrInt);
        printArr(arrString);

        Shape shape = new Shape();
        System.out.println(shape.area(4));
        System.out.println(shape.area(4, 5));
        System.out.println(shape.area(4, 5, 6));
    }

    public static void printArrInt(Integer[] arrInt) {
        for (Integer ele : arrInt) System.out.println(ele);
    }

    public static void printArrString(String[] arrString) {
        for (String ele : arrString) System.out.println(ele);
    }

    public static <T> void printArr(T[] arr) {
        for (T ele : arr) System.out.println(ele);
    }

    // Generic Interface:
    // Generic Wildcard ( ? ): 1 loại, 1 kiểu dữ liệu không rõ ràng
    // <?>: chấp nhận các loại đối số
//    Person<?> person4 = new Person<>(4, 20);
    //  Ký tự đại diện <? extends type>

// Nhược điểm của generic:
//    Kiểu dữ liệu nguyên thủy: int, long, double, float...
//  Object – Wrapper: Integer, String, Double
// Không thể overload với phương thức generic

//  1. Overload: nạp chồng phương thức
// 2. Override: ghi đè


}
