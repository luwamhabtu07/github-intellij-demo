package zoo;

class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Trumpet!");
    }
}
