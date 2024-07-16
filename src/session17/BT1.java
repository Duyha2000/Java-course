package session17;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) throws CheckedException {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        boolean isCheck = true;
        while (isCheck) {
            try {
                System.out.println("Nhập số nguyên thứ nhất:");
                number1 = Integer.parseInt(scanner.nextLine()); // 7.4, "caaaaa -> scanner.nextInt();
                isCheck = false;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        boolean isCheck2 = true;
        while (isCheck2) {
            try {
                System.out.println("Nhập số nguyên thứ hai:");
                number2 = Integer.parseInt(scanner.nextLine());
                isCheck2 = false;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        int sum = number1 + number2;
        System.out.println(sum);
    }
}
