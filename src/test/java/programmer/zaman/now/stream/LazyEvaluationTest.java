package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Robby", "Ilham", "Kusuma");

        Stream<Object> upper = names.stream()
                .map(name -> {
                    System.out.println("Change" + name + "to Uppercase");
                return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Robby", "Ilham", "Kusuma");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to Uppercase");
                return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr. ");
                return "Mr. " + upper;
                })
                //.forEach(upper -> {
                .forEach(mr -> { // harus menggunakan foreach agar dapat berjalan
                    System.out.println(mr);
                });

    }
}
