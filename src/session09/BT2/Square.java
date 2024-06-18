package session09.BT2;

public class Square extends Shape implements IColorable {
    private final int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }

    @Override
    public double getArea() {
        return Math.pow(2, this.size);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                " Area = " + getArea() +
                '}';
    }
}
