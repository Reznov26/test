package CatExample;

public class Cat {
    double weight;
    String name;
    int age;
    String color;
    void meow() {
        System.out.println("Meow");
    }
    void pee() {
        weight -=20;
    }
    void eat() {
        weight += 50;
    }
}
