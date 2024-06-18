public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Ll "; //include - trim

        // contain:
        System.out.println(s1.toLowerCase().contains(s2.trim().toLowerCase())); // true
    }
}
