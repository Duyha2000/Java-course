package session12;

import java.util.Scanner;
import java.util.Stack;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // B1 Tạo một stack rỗng để lưu trữ các phần tử.
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Nhập số phần tử cần lưu trữ: ");
        int n = Integer.parseInt(scanner.nextLine().trim());
//      B2 Duyệt qua từng phần tử trong mảng:
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử vào Stack: ");
            numbers.push(Integer.parseInt(scanner.nextLine()));
        }

        int maxNumber = numbers.pop();

        for (int i = 0; i < n - 1; i++) {
            int currentNumber = numbers.pop();
            if (currentNumber > maxNumber) {
                numbers.push(maxNumber);
                maxNumber = currentNumber;
            }
        }


//        B3 In ra phần tử lớn nhất nằm trên đỉnh của stack.
        System.out.println(maxNumber);
    }
}
