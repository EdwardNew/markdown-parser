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

    @Test
    public void mdTest2() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("test-file1.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest3() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("test-file2.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest4() throws Exception{
        List expected = List.of("https://www.helloworldstudio.org/");

        Path filepath = Path.of("test-file3.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }
}