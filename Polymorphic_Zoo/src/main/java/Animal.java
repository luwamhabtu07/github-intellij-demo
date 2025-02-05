package zoo;

// Abstract class Animal
abstract class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method for sound
    public abstract void makeSound();

    // Overloaded method for repeated sound
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // Get name of animal
    public String getName() {
        return name;
    }
}
