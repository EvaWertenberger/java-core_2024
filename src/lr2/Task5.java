package lr2;

import java.util.Scanner;

public class Task5 {
    private float length;
    private float width;

    public Task5(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float CalcArea() {
        return width*length;
    }

    public float CalcPerimeter() {
        return 2 * (width + length);
    }
    //Пример использования
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите длину: ");
        float length = id.nextFloat();

        System.out.println("Введите ширину: ");
        float width = id.nextFloat();

        Task5 rectangle = new Task5(length, width);

        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.CalcArea());
        System.out.println("Периметр: " + rectangle.CalcPerimeter());

        rectangle.setLength(20);
        System.out.println("Новая длина: " + rectangle.getLength());
    }
}
