package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Robby");
        builder.add("Ilham").add("Kusuma");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);;
    }

    @Test
    void testCreateStreamBuilderSimplify() {

        Stream<Object> stream = Stream.builder().add("Robby")
                .add("Robby").add("Ilham").add("Kusuma").build();

        stream.forEach(System.out::println);
    }
}
