package Generic;

public class Sum {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        sumArr(arr);
    }

    public static <T extends Number> void sumArr(T[] arr) {
        double sum = 0.0;
//        for - each
        for (T num : arr) sum += num.doubleValue();
        System.out.println(sum);
    }
}
