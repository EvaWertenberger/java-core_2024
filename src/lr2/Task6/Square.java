package lr2.Task6;

public class Square implements GeometricFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    //Переопределение метода расчёта площади для квадрата
    @Override
    public double calcArea() {
        return Math.pow(side,2);
    }
    //Переопределение метода расчёта периметра для квадрата
    @Override
    public double calcPerimeter() {
        return 4  *  side;
    }
}
