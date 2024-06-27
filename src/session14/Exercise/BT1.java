package session14.Exercise;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BT1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//      Stream.generate(() -> random.nextInt(50)).limit(10).toList(): random number
//        List<Integer> arr = Stream.generate(() -> random.nextInt(50)).limit(10).toList();
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 45, 6));
//        Max number:
//   C1:     Optional<Integer> maxNumber = arr.stream().max(Integer::compareTo);
//        System.out.println(maxNumber);
        Optional<Integer> maxNumber = arr.stream().max(Integer::compareTo);

//        Filter so chan:
        Stream<Integer> evenNumberArr = arr.stream().filter(num -> num % 2 == 0);
        System.out.println("So chan la: ");
        evenNumberArr.forEach(System.out::println);
//      Filter lọc các số lớn hơn một giá trị xác định mà người dùng nhập vào
        System.out.println("Nhập vào 1 số: ");
        int number = Integer.parseInt(scanner.nextLine());
        Stream<Integer> higherNumber = arr.stream().filter(num -> num > number);
        System.out.println("Các số lớn hơn số nhập vào là: ");
        higherNumber.forEach(System.out::println);
//         phương thức reduce() để tính tổng của các số trong danh sách.
        int sumArr = arr.stream().reduce(0, Integer::sum);
        System.out.println("sum Arr: " + sumArr);
//      phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.
        boolean isCheck = arr.stream().anyMatch(num -> num % 2 == 0);
        System.out.println(isCheck);
//      phương thức range() để tạo danh sách các số từ x đến y.
        System.out.println("Range: ");
        IntStream.range(10, 30).forEach(System.out::println);
// phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái.
        String[] names = {"Huynh Cong Tinh", "Huynh Tam Anh", "Huynh Cong Tình"};
        Arrays.stream(names).sorted().forEach(System.out::println);
//       phương thức map() để chuyển các chuỗi thành chữ in hoa.
        Arrays.stream(names).map(String::toUpperCase).forEach(System.out::println);
    }
}
