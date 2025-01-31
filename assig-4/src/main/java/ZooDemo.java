import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        // Create animal objects
        Animal lion = new Lion("Simba");
        Animal elephant = new Elephant("Dumbo");
        Animal monkey = new Monkey("George");

        // Add animals to the zoo collection
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(monkey);

        // Loop through the collection and call methods
        for (Animal animal : zoo) {
            System.out.println("Animal: " + animal.getName());
            System.out.print("Single Sound: ");
            animal.makeSound();
            System.out.print("Multiple Sounds: ");
            animal.makeSound(3); // Overloaded method
            System.out.println();
        }
    }
}
