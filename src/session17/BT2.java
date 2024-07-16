package session17;

import java.util.Arrays;
import java.util.Scanner;

public class BT2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        try {
            if (!isEmpty(arr)) {
                Arrays.sort(arr);
                System.out.println(arr[arr.length - 1]);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static boolean isEmpty(int[] arr) throws Exception {
        if (arr == null || arr.length == 0) throw new Exception("Mảng rỗng");
        return false;
    }
}
