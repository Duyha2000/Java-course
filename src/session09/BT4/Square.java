package session09.BT4;

public class Square extends Shape implements IColorable {
    private int size;

    public Square(String color, int size) {
        super(color);
        this.size = size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return Math.pow(2, this.size);
    }

    @Override
    public String toString() {
        return super.toString() + " " + getArea();
    }
}
