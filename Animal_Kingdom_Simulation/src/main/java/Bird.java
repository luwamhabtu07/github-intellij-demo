public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet!");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }
}