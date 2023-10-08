package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TransformationOperationTest {

    @Test
    void testMap() {
        List.of("Robby", "Ilham", "Kusuma").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }
}
