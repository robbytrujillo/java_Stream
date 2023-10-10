package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Robby", "Ilham", "Kusuma", "Asep", "Tatang").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Robby", "Ilham", "Kusuma", "Asep", "Tatang").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Robby", "Ilham", "Kusuma", "Asep", "Tatang").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Robby", "Ilham", "Kusuma", "Asep", "Tatang").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testRetrievingSingleElementOperation() {
        List<String> names = List.of("Robby", "Ilham", "Kusuma", "Asep", "Tatang");

        Optional<String> anyName = names.stream().findAny();
        Optional<String> firstName = names.stream().findFirst();
    }
}
