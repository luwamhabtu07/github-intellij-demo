package zoo;

class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Roar!");
    }
}
