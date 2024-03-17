package lr2.Task6;

public class Circle implements GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    //Переопределение метода расчёта площади для круга
    @Override
    public double calcArea() {
        return Math.PI  *  Math.pow(radius,2);
    }
    //Переопределение метода расчёта периметра для круга
    @Override
    public double calcPerimeter() {
        return 2  *  Math.PI  *  radius;
    }
}
