package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap() {
        List.of("Robby", "Ilham", "Kusuma").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())// merubah dari bentuk data ke bentuk data yang lain
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMap() {
        List.of("Robby", "Ilham", "Kusuma").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length())) // merubah dari sebuah data menjadi stream yang lain
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(length -> System.out.println(length));
    }
}
