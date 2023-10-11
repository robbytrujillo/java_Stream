package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {
        List.of("Robby", "Ilham", "Kusuma", "Programmer", "Zaman", "Now").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Robby", "Ilham", "Kusuma", "Programmer", "Zaman", "Now").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Robby", "Ilham", "Kusuma", "Programmer", "Zaman", "Now").stream()
                .count();
        System.out.println(count);
    }

    // Reduce Operator
    @Test
    void testSum() {
        List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);
    }
}
