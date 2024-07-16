package session17;

import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
//        Bước 1: Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
//        Bước 2: Sắp xếp mảng
        Arrays.sort(arr);
//        Bước 3: Thực hiện tìm kiếm nhị phân
        try {
            System.out.println(binarySearch(arr, 5));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static int binarySearch(int[] arr, int number) throws Exception {
        int left = 0, right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) index = mid;
            if (arr[mid] < number) left = mid + 1;
            else right = mid - 1;
        }
        if (index == -1) throw new Exception("Không tìm thấy phần tử này trong mảng");
        return index;
    }
}
