package session12;

import java.util.Scanner;
import java.util.Stack;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: "); // 23579
        String input = scanner.nextLine().trim();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            c = Character.toLowerCase(c);
            stack.push(c);
        }
//        Bước 3: Khởi tạo một biến flag để lưu trữ kết quả kiểm tra, ban đầu gán giá trị là true.
        boolean isCheck = true;
//Bước 4: Duyệt qua từng ký tự trong chuỗi đầu vào bằng vòng lặp for, và so sánh với ký tự đầu tiên trong Stack bằng phương thức peek().
        char firstChar = stack.peek();
        for (Character c : stack) {
// Bước 5: Nếu ký tự trong chuỗi lớn hơn ký tự đầu tiên trong Stack, ta gán giá trị của flag là false và thoát khỏi vòng lặp.
            if (firstChar > c) {
                isCheck = false;
                break;
            }
        }
//        Bước 6: Nếu vòng lặp kết thúc mà flag vẫn giữ nguyên giá trị true, tức là chuỗi đầu vào là dãy giảm dần.
        if (isCheck) System.out.println("Giam dan");
        else System.err.println("Noooo");

    }
}
