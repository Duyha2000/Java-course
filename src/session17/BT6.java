package session17;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        int numerator = extracted(scanner, 1); //
        int denominator = extracted(scanner, 2);
        try {
            if (isDenominator(denominator)) result = (double) numerator / denominator;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println(result);

    }

    public static boolean isDenominator(int num) throws Exception {
        if (num == 0) throw new Exception("Mẫu số phải khác 0");
        return false;
    }


    private static int extracted(Scanner scanner, int index) {
        int number = 0;
        boolean isCheck = true;
        while (isCheck) {
            try {
                System.out.println("Nhập số thứ " + index + " :");
                number = Integer.parseInt(scanner.nextLine());
                isCheck = false;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return number;
    }
}
