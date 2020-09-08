import java.util.Formatter;

public class CreateFile {

    public Formatter formatter;

    public void openFile() {
        try {
            formatter = new Formatter("Books.txt");
        } catch (Exception e) {
            System.out.println("There is a problem with opening Books.txt");
        }
    }

    public void addHeader() {
        formatter.format("%s %s %s %s %s\n", "TITLE", "FIRSTNAME", "LASTNAME", "BOOKSTAND", "SHELF");
    }

    public void closeFile() {
        formatter.close();
    }
}
