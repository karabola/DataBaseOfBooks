import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class CreateFileTest {

    public Formatter formatter;
    public CreateFile createFile;

    @Test
    public void addHeaderTest() throws IOException {
        String fileName = "BooksTest.txt";
        formatter = new Formatter(fileName);
        createFile = new CreateFile();
        createFile.formatter = formatter;

        // !!!!!
        createFile.addHeader();
        createFile.closeFile();
        // !!!!!


        Scanner scanner = new Scanner(new File(fileName));
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.next());
            if(scanner.hasNext())
                stringBuilder.append(" ");
        }

        String output = stringBuilder.toString();
        scanner.close();
        Files.delete(Paths.get(fileName));

//        if ("TITLE FIRSTNAME LASTNAME BOOKSTAND SHELF".equals(output))
        assertEquals("TITLE FIRSTNAME LASTNAME BOOKSTAND SHELF", output);


    }
}