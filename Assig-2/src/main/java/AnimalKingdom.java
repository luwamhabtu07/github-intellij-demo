import java.util.ArrayList;

public class AnimalKingdom {
    public static void main(String[] args) {
        // Create instances of each animal
        Dog dog = new Dog("Buddy", 5);
        Cat cat = new Cat("Whiskers", 3);
        Bird bird = new Bird("Tweety", 1);

        // Store them in an ArrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        // Loop through and call methods
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            animal.makeSound();

            // Call specific methods
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).climb();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }

            System.out.println();
        }
    }
}
