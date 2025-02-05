import java.util.ArrayList;

public class AnimalKingdom {
    public static void main(String[] args) {
        // Normal Test Cases
        System.out.println("=== Normal Test Cases ===");

        // 1. Create instances of each animal and verify overridden makeSound()
        Dog dog = new Dog("Buddy", 5);
        Cat cat = new Cat("Whiskers", 3);
        Bird bird = new Bird("Tweety", 1);

        // 2. Store them in an ArrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        // 3. Loop through and call methods to verify behaviors
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

        // Edge Test Cases
        System.out.println("=== Edge Test Cases ===");

        // 1. Create an animal with an empty name
        Dog namelessDog = new Dog("", 2);
        namelessDog.displayInfo();

        // 2. Set a negative age
        Cat negativeAgeCat = new Cat("Shadow", -1);
        negativeAgeCat.displayInfo();

        // 3. Ensure ArrayList processing works when no animals are added
        ArrayList<Animal> emptyAnimalList = new ArrayList<>();
        if (emptyAnimalList.isEmpty()) {
            System.out.println("No animals in the list. Test passed.");
        }

        System.out.println("\nAll test cases executed.");
    }
}
