package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {
        // Jarang digunakan cara seperti ini oleh developer java
        List<String> list = List.of("Robby", "Ilham", "Kusuma");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOk() {
        List<String> list = List.of("Robby", "Ilham", "Kusuma");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
