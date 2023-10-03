package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();

        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Robby"); // Stream.of -> wajib memasukkan data minimal satu elemen

        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = "Kusuma";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);

        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });

    }

    // kode menjalankan stream
    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStream = Stream.of("Robby", "Ilham", "Kusuma");

        arrayStream.forEach(name -> {
            System.out.println(name);
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
        streamFromArray.forEach(System.out::println);

    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collectionString = List.of("Robby", "Ilham", "Kusuma");

        Stream<String> stringStream = collectionString.stream();

        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = collectionString.stream();

        stringStream2.forEach(System.out::println);
    }

    // membuat infinite stream (mengalir secara terus menerus)
    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Programmer Zaman Now");
        // stream.forEach(System.out::println);

        Stream<Integer> interate = Stream.iterate(1, value -> value + 1);

        interate.forEach(System.out::println);
    }
}
