package session12;

import java.util.Scanner;
import java.util.Stack;

public class BT1 {
    public static void main(String[] args) {
        // B1: Tạo 1 Stack để lưu trữ văn bản
        Stack<String> strings = new Stack<>();
        // B2: Nhập số lượng từ cần nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng từ cần nhập từ bàn phím");
        int number = Integer.parseInt(scanner.nextLine());
        // B3: Tạo 1 vòng lặp for với số lần lặp bằng số lượng từ vừa nhập mỗi vòng lặp cho nhập 1 từ. rồi push vào stack.
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập từ muốn thêm vào: ");
            String word = scanner.nextLine();
            strings.push(word);
        }
        // B4: Tạo vòng lặp rồi in các từ trong stack ra bằng phương thức pop()
        while (!strings.isEmpty()) {
            System.out.println(strings.pop());
        }
        scanner.close();
    }
}
