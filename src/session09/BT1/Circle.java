package session09.BT1;

public class Circle implements IResizable {
    private double size;

    public Circle(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        this.size = this.size * (1 + percent / 100);
    }

    public double area() {
        return 2 * Math.PI * this.size;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "size=" + size +
                " Area: " + area() +
                '}';
    }
}
