package zoo;

import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        // Create an ArrayList of animals
        ArrayList<Animal> zoo = new ArrayList<>();

        // Normal Test Cases
        System.out.println("=== Normal Test Cases ===");

        //  Test Case 1: Each animal should make its unique sound
        Animal lion = new Lion("Simba");
        Animal elephant = new Elephant("Dumbo");
        Animal monkey = new Monkey("George");

        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(monkey);

        for (Animal animal : zoo) {
            animal.makeSound();
        }

        //  Test Case 2: Overloaded makeSound() should repeat sound 3 times
        System.out.println("\nTest Case 2: Repeated Sounds");
        for (Animal animal : zoo) {
            animal.makeSound(3);
        }

        //  Test Case 3: Ensure getName() returns the correct name
        System.out.println("\nTest Case 3: Verifying Animal Names");
        for (Animal animal : zoo) {
            System.out.println("Animal name: " + animal.getName());
        }

        // Edge Case Test Cases
        System.out.println("\n=== Edge Case Test Cases ===");

        //  Edge Case 1: Creating an animal with an empty name
        try {
            System.out.println("\nTest Case 1: Empty Name Animal");
            Animal noNameAnimal = new Lion("");
            System.out.println("Created animal with empty name: '" + noNameAnimal.getName() + "'");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //  Edge Case 2: Calling makeSound(0) (Zero Repetitions)
        try {
            System.out.println("\nTest Case 2: No Sound Output (0 Repetitions)");
            lion.makeSound(0); // Should not print anything
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //  Edge Case 3: Calling makeSound(-1) (Negative Repetitions)
        try {
            System.out.println("\nTest Case 3: Negative Repetitions (Should not crash)");
            lion.makeSound(-1); // Should not print anything or crash
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n All Test Cases Completed Successfully!");
    }
}
