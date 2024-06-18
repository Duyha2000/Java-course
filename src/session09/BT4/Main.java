package session09.BT4;

public class Main {
    public static void main(String[] args) {

//        Rectangle r1 = new Rectangle("Red", 2, 2, 3);
//
//        r1.getArea();
//        System.out.println(r1);
//        Square s1 = new Square("Red", 2);
//        s1.getArea();
//        System.out.println(s1);
        Shape[] shapes = new Shape[2];
        // Gọi method howToColor();
        shapes[0] = new Square("Red", 2);
        shapes[1] = new Rectangle("Blue", 2, 3, 4);

        for (Shape shape : shapes) {
//            instanceof: chứa
            if (shape instanceof IColorable) ((IColorable) shape).howToColor();
            System.out.println(shape);
        }
    }
}
