package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {

    @Test
    void testAnyMatch() {
        Boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .anyMatch(number -> number > 20);

        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        Boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .allMatch(number -> number > 0);

        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        Boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .noneMatch(number -> number > 100);

        System.out.println(match);
    }
}
