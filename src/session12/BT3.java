package session12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine().trim();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add each character to both the stack and the queue
        for (char c : input.toCharArray()) {
            c = Character.toLowerCase(c);
            stack.push(c);
            queue.offer(c);
        }
        System.out.println(stack);
        System.err.println(queue);

        // Compare the characters from the stack and the queue
        boolean isPalindrome = true;
        // stack.pop -> Xóa và trả về phần tử cuối cùng của stack.
        // queue.poll -> Xóa và trả về phần tử đầu tiên của queue
        System.out.println(stack.pop());
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) System.out.println("Palindrome!");
        else System.err.println("Not Palindrome!");
    }
}
