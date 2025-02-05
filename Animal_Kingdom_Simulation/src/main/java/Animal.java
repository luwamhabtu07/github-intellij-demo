public abstract class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // General methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Display animal details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
