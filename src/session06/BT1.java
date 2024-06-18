package session06;

import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        String s = "rikkeiAcademy"; // [r,i,k,k,e,i,A,c,a,d,e,m,y]
        System.out.println(s.isEmpty()); // Rỗng ra true - k rỗng ra false
        String s2 = s.trim();
        System.out.println(s2);
        String s3 = "Mai Xuan Sang";
        System.out.println(s.equals(s3));
        // Arrays.toString
        System.out.println(Arrays.toString(s.split("")));
//        Concat: nối chuỗi:
        System.out.println(s + s3);
        System.out.println(s.concat(s3));
        //  contains: thông thường dùng để filter: (trả về true / false)
        String s4 = "ri";
        System.out.println(s.contains(s4));
        // replace: Đổi tất cả ký tự k thành m;
        String s5 = s.replace('k', 'm');
        System.out.println(s5);

        // Sử dụng stringBuilder để làm việc với chuỗi;
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // rikkeiAcademy
        StringBuilder s6 = new StringBuilder(input);
        int index = s6.indexOf("k");
        System.out.println(index);
        s6.replace(index, index + 1, "m");
        s6.delete(index, index + 1);
        System.out.println(s6);
        
    }

}
