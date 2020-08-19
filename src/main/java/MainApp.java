import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        createfile createfileObject = new createfile();
        createfileObject.openFile();
        createfileObject.addRecord();
        createfileObject.closeFile();

        addrecord addrecordObject=new addrecord();
        addrecordObject.openFile();
        addrecordObject.addRecord();
        addrecordObject.closeFile();

        readfile readfileObject=new readfile();
        readfileObject.openFile();
        readfileObject.readFile();
        readfileObject.closeFile();


    }

}
