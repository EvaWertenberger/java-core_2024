package lr2.Task9;

public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calcDiag() {
        return Math.sqrt(2)*sideLength;
    }

    @Override
    public double calcArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calcPerimeter() {
        return 4 * sideLength;
    }
}
