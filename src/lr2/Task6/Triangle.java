package lr2.Task6;

public class Triangle implements GeometricFigure {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //Переопределение метода расчёта площади для треугольника
    @Override
    public double calcArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s  *  (s - side1)  *  (s - side2)  *  (s - side3));
    }
    //Переопределение метода расчёта периметра для треугольника
    @Override
    public double calcPerimeter() {
        return side1 + side2 + side3;
    }
}