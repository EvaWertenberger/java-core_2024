package lr2.Task9;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.calcArea());
        System.out.println("Периметр круга: " + circle.calcPerimeter());

        Square square = new Square(4.0);
        System.out.println("Площадь квадрата: " + square.calcArea());
        System.out.println("Периметр квадрата: " + square.calcPerimeter());
        System.out.println("Диагональ квадрата: " + square.calcDiag());

        isoscelesTriangle triangle = new isoscelesTriangle(3.0, 4.0);
        System.out.println("Площадь равнобедренного треугольника: " + triangle.calcArea());
        System.out.println("Периметр равнобедренного треугольника: " + triangle.calcPerimeter());
        System.out.println("Бедро равнобедренного треугольника: " + triangle.calcHip());
    }
}
