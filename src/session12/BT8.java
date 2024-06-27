package session12;

import java.util.Scanner;
import java.util.Stack;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: "); // 23579
        String input = scanner.nextLine().trim();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            c = Character.toLowerCase(c);
            stack.push(c);
        }

        System.out.println(stack); // ['2', '3', '5', '7', '9']

        boolean isCheck = true;
        while (!stack.isEmpty()) {
//            int number = Integer.parseInt(String.valueOf(stack.pop()));
            int number = Character.getNumericValue(stack.pop());
            if (!isPrime(number)) {
                isCheck = false;
                break;
            }
        }
        
        if (isCheck) System.out.println("Full ngto");
        else System.err.println("Ko full nto");
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
