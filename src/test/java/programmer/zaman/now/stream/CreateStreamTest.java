package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();

        Stream<String> oneStream = Stream.of("Robby"); // Stream.of -> wajib memasukkan data minimal satu elemen

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);

    }
}
