import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testTestFile1() throws IOException{
		List<String> StringInput = List.of("https://something.com", "some-thing.html");
        List<String> Actual = MarkdownParse.getLinks(Files.readString(Path.of("/Users/tiannahuang/Documents/GitHub/markdown-parser-1/test-file.md")));
        assertEquals(StringInput, Actual);
    }

    // @Test
    // public void testTestFile2() throws IOException{
	// 	List<String> StringInput = List.of("https://google.com", "some-thing.html");
    //     List<String> Actual = MarkdownParse.getLinks(Files.readString(Path.of("/Users/tiannahuang/Documents/GitHub/markdown-parser-1/test-file2.md")));
    //     assertEquals(StringInput, Actual);
    // }

    @Test
    public void testTestFile3() throws IOException{
		List<String> StringInput = List.of();
        List<String> Actual = MarkdownParse.getLinks(Files.readString(Path.of("/Users/tiannahuang/Documents/GitHub/markdown-parser-1/test-file3.md")));
        assertEquals(StringInput, Actual);
    }

    @Test
    public void testTestFile5() throws IOException{
		List<String> StringInput = List.of("page.com");
        List<String> Actual = MarkdownParse.getLinks(Files.readString(Path.of("/Users/tiannahuang/Documents/GitHub/markdown-parser-1/test-file5.md")));
        assertEquals(StringInput, Actual);
    }

    @Test
    public void testTestFile6() throws IOException{
		List<String> StringInput = List.of("page.com");
        List<String> Actual = MarkdownParse.getLinks(Files.readString(Path.of("/Users/tiannahuang/Documents/GitHub/markdown-parser-1/test-file6.md")));
        assertEquals(StringInput, Actual);
    }



}

}