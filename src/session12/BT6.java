package session12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // B1 Tạo một Queue rỗng để lưu trữ các phần tử.
        Queue<Integer> numbers = new LinkedList<>();
        System.out.println("Nhập số phần tử cần lưu trữ: ");
        int n = Integer.parseInt(scanner.nextLine().trim());
//        B2 Duyệt qua từng phần tử trong mảng:
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử vào Stack: ");
            numbers.offer(Integer.parseInt(scanner.nextLine()));
        }

        int minNumber = numbers.poll();

        for (int i = 0; i < n - 1; i++) {
            int currentNumber = numbers.poll();
            if (currentNumber < minNumber) {
                numbers.offer(minNumber);
                minNumber = currentNumber;
            }
        }

        System.out.println(minNumber);
    }
}
