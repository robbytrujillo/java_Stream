package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {

        List<String> names = List.of("Robby", "Ilham", "Kusuma");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase()); // map itu dugunakan untuk mengkonversi dari suatu data asli menjadi data baru

        streamUpper.forEach(System.out::println);
    }
}
