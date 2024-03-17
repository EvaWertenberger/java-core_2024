package lr2.Task8;

public class TestAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс", 3, "Лабрадор");
        dog.makeSound(); // Вызов метода makeSound() из класса Animal
        dog.bark(); // Вызов метода bark()
        System.out.println(dog.getBreed()); // Вызов метода getBreed()
        System.out.println();

        Cat cat = new Cat("Том", 2, "Рыжий");
        cat.makeSound(); // Вызов метода makeSound() из класса Animal
        cat.meow(); // Вызов метода meow()
        System.out.println(cat.getFurColor()); // Вызов метода getFurColor()
        System.out.println();

        Bird bird = new Bird("Кеша", 1, true);
        bird.makeSound(); // Вызов метода makeSound() из класса Animal
        bird.chirp();
        System.out.println(bird.getName() + " " + (bird.fly() ? "умеет" : "не умеет")
                + " летать"); // Вызов метода fly()
    }
}
