package lr2.Task8;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " лает");
    }

    public String getBreed() {
        return breed;
    }
}
