package Generic;

public class Shape {
    int a, b, c;

    public Shape(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double area(int a) {
        return Math.PI * a * a;
    }


    public double area(int a, int b) {
        return a * b;
    }


    public double area(int a, int b, int c) {
        double p = (double) (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
