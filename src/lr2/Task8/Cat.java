package lr2.Task8;

public class Cat extends Animal {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public void meow() {
        System.out.println(getName() + " мяукает");
    }

    public String getFurColor() {
        return furColor;
    }
}
