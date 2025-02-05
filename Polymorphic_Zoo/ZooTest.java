package zoo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ZooTest {

    @Test
    void testLionNormalSound() {
        Lion lion = new Lion("Simba");
        assertEquals("Simba", lion.getName());

        // Capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lion.makeSound();
        assertTrue(outContent.toString().contains("Simba says: Roar!"));
    }

    @Test
    void testElephantNormalSound() {
        Elephant elephant = new Elephant("Dumbo");
        assertEquals("Dumbo", elephant.getName());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        elephant.makeSound();
        assertTrue(outContent.toString().contains("Dumbo says: Trumpet!"));
    }

    @Test
    void testMonkeyNormalSound() {
        Monkey monkey = new Monkey("George");
        assertEquals("George", monkey.getName());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        monkey.makeSound();
        assertTrue(outContent.toString().contains("George says: Oooh Oooh Ahh Ahh!"));
    }

    @Test
    void testMakeSoundMultipleTimes() {
        Lion lion = new Lion("Simba");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lion.makeSound(3);
        String output = outContent.toString();
        assertEquals("Simba says: Roar!\nSimba says: Roar!\nSimba says: Roar!\n", output);
    }

    @Test
    void testEdgeCaseEmptyName() {
        Lion lion = new Lion("");
        assertEquals("", lion.getName());
    }

    @Test
    void testEdgeCaseNegativeSound() {
        Lion lion = new Lion("Simba");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lion.makeSound(-1);
        assertEquals("", outContent.toString()); // No output expected
    }
}
