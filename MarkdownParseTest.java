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
    public void myMdTest1() throws Exception{
        List expected = List.of("https://something.com", "some-thing.html");

        Path filepath = Path.of("test-file.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void myMdTest2() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("myTest-file1.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void myMdTest3() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("myTest-file2.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
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
        List expected = List.of("https://something.com", "some-page.html");

        Path filepath = Path.of("test-file2.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest3() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("test-file3.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest4() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("test-file4.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest5() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("test-file5.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest6() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("test-file6.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest7() throws Exception{
        List expected = List.of();

        Path filepath = Path.of("test-file7.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void mdTest8() throws Exception{
        List expected = List.of("a link on the first line");

        Path filepath = Path.of("test-file8.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    //Tests for Lab Report 4
    @Test
    public void labTestSnippet1() throws Exception{
        List expected = List.of("`google.com", "google.com", "ucsd.edu");

        Path filepath = Path.of("lab-report-snippet1.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void labTestSnippet2() throws Exception{
        List expected = List.of("a.com", "a.com(())", "exmaple.com");

        Path filepath = Path.of("lab-report-snippet2.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

    @Test
    public void labTestSnippet3() throws Exception{
        List expected = List.of("https://www.twitter.com",
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
        "https://cse.ucsd.edu/");

        Path filepath = Path.of("lab-report-snippet3.md");
        String file = Files.readString(filepath);
        assertEquals(expected, MarkdownParse.getLinks(file));
    }

}
