package session09.BT2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(5);
        shapes[1] = new Square(3);
        for (Shape shape : shapes) System.out.println(shape);
    }
}
