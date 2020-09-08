import java.io.IOException;

public class BooksHelper {
    CreateFile createFile;
    ReadFile readFile;
    AddRecord addRecord;

    public BooksHelper() {
        this.createFile = new CreateFile();
        this.readFile = new ReadFile();
        this.addRecord = new AddRecord();
    }

    private void createFile() {
        createFile.openFile();
        createFile.addHeader();
        createFile.closeFile();
    }

    private void addRecords() throws IOException {
        addRecord.openFile();
        addRecord.addRecords();
        addRecord.closeFile();
    }

    private void readFile() {
        readFile.openFile();
        readFile.readFile();
        readFile.closeFile();
    }

    public void processAll() throws IOException {
        this.createFile();
        this.addRecords();
        this.readFile();
    }
}
