package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeek() {
        List.of("Robby", "Ilham", "Kusuma", "Programmer", "Zaman", "Now").stream()
                .map(name ->{
                    System.out.println("Before Change Name to Upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change name to Upper : " + upper);
                    return upper;
                } )
                .forEach(name -> System.out.println("Final name : " + name));
    }
}
