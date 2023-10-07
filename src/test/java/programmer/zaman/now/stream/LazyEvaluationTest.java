package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Robby", "Ilham", "Kusuma");

        Stream<Object> upper = names.stream()
                .map(name -> {
                    System.out.println("Change" + name + "to Uppercase");
                return name.toUpperCase();
                });

    }
}
