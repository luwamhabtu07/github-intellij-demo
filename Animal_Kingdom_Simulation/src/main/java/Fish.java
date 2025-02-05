public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes bubbling sounds.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
