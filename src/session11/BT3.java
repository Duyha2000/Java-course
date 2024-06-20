package session11;

import java.util.Arrays;
import java.util.List;

public class BT3 {
    public static void main(String[] args) {
        //   B1: Tạo chuỗi có giá trị là: “Rikkei Academy để nông dân biết code”
        String str = "Rikkei Academy để nông dân biết code";

        //   B2: Tạo 1 list có các pt kiểu String.
        String[] stringList = str.split("\\s+"); // chuyển chuỗi thành 1 mảng, mỗi 1 chữ là 1 phần tử trong mảng
        System.err.println(Arrays.toString(stringList)); // oldString (array)

        List<String> newString; // khởi tạo 1 mảng

        //   B3: Convert chuỗi ở bước 1 thành các phần tử trong mảng(Array) rồi gán vào list được tạo ở bước.

        newString = List.of(stringList);

        //   B4: Duyệt list trên và in ra các phần tử có nhiều hơn 3 ký tự
        for (String string : newString) {
            if (string.length() > 3) System.out.print(string + " ");
        }
    }
}
