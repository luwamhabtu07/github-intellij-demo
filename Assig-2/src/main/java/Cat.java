public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    public void climb() {
        System.out.println(name + " is climbing a tree.");
    }
}

