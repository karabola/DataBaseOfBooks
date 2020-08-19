
import java.io.FileWriter;
import java.io.IOException;

public class addrecord {

    public FileWriter x;

    public void openFile() {
        try {
            String filename= "Books.txt";
            x = new FileWriter(filename,true);
        }
        catch (Exception e) {
            System.out.println("There is a problem");
        }
    }
    public void addRecord(){
        try {
            x.write("Pinokio Carlo Collodi B 4\n");
            x.write("Proszę_mnie_przytulić Przemysław Wechterowicz K 2\n");
            x.write("W_pustyni_i_w_puszczy Henryk Sienkiewicz L 4\n");
        } catch (IOException e) {
            System.out.println("Error");;
        }
    }
    public void closeFile() throws IOException {
        x.close();
    }
}
