package lr2.Task6;

public class TestFigures {
    public static void main(String[] args) {
        lr2.Task6.Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.calcArea());
        System.out.println("Периметр круга: " + circle.calcPerimeter());

        lr2.Task6.Square square = new Square(4);
        System.out.println("Площадь квадрата: " + square.calcArea());
        System.out.println("Периметр квадрата: " + square.calcPerimeter());

        lr2.Task6.Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.calcArea());
        System.out.println("Периметр треугольника: " + triangle.calcPerimeter());
    }
}
