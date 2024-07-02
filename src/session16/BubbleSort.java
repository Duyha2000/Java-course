package session16;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 36, 37, 30, 20, 20, 30, 29, 37, 49, 1};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
//        Mảng đã được duyệt: [5,9,10,37]
//        Mảng chưa được duyệt: 30
        int i, j;
        for (i = 1; i < arr.length; i++) {
            // Vòng lặp con thể hiện cho mảng đã sắp xếp
            for (j = i - 1; j >= 0 && arr[j + 1] < arr[j]; j--) {
                // arr[j] = 1
                int temp = arr[j]; // temp = 49
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
