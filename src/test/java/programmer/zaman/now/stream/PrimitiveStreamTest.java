package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class PrimitiveStreamTest {

    @Test
    void testCreate() {
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(System.out::println);
    }
}
