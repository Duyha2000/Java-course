package session06;

import java.util.regex.Pattern;

public class BT3 {
    public static void main(String[] args) {
        String s = "rikeiacademy@rikkeisoft.com";
        boolean isCheckEmail = Pattern.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b", s);
        if (isCheckEmail) System.out.println("Hợp lệ");
        else System.out.println("Không hợp lệ");
    }
}
