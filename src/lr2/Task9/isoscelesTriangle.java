package lr2.Task9;

public class isoscelesTriangle extends Shape {
    private double base;
    private double height;


    public isoscelesTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calcHip() {
        return Math.sqrt(Math.pow((base / 2),2)+Math.pow(height,2));
    }

    @Override
    public double calcArea() {
        return (base * height) / 2;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.sqrt(Math.pow((base / 2),2)+Math.pow(height,2)) + base;
    }
}
