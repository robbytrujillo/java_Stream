package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();

        Stream<String> oneStream = Stream.of("Robby"); // Stream.of -> wajib memasukkan data minimal satu elemen

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);

    }

    // kode menjalankan stream
    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStream = Stream.of("Robby", "Ilham", "Kusuma");

        arrayStream.forEach(value -> {
            System.out.println(value);
        });

        Stream<Integer> streamInteger = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        streamInteger.forEach(value -> {
            System.out.println(value);
        });

        // Stream<String> streamArray = Arrays.stream(new String[] {"Robby", "Ilham", "Kusuma"});

        String[] array = new String[] {
                "Robby", "Ilham", "Kusuma"
        };

        Stream<String> streamFromArray = Arrays.stream(array);

    }
}
