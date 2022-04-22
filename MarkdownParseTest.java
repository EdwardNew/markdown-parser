import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.nio.file.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void mdTest1() throws Exception{
        List expected = List.of("https://something.com", "some-thing.html");

        Path filepath = Path.of("test-file.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }
}