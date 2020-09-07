
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AddRecord {

    public FileWriter fileWriter;
    private int i;

    public void openFile() {
        try {
            String filename = "Books.txt";
            fileWriter = new FileWriter(filename, true);
        } catch (Exception e) {
            System.out.println("There is a problem");
        }
    }

    private void addRecord(String recordName) {
        try {
            fileWriter.write(recordName + "\n");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void addRecords() {

       this.addRecord("Pinokio Carlo Collodi B 4");
       this.addRecord("Proszę_mnie_przytulić Przemysław Wechterowicz K 2");
       this.addRecord("W_pustyni_i_w_puszczy Henryk Sienkiewicz L 4");

      /* ArrayList<String> books = new ArrayList<String>();
      books.add("Pinokio Carlo Collodi B 4");
      books.add("Proszę_mnie_przytulić Przemysław Wechterowicz K 2");
      books.add("W_pustyni_i_w_puszczy Henryk Sienkiewicz L 4");*/

        return;
    }
    public int [] addOneToArray (int [] books) {
        int lenght = books.length;
        int[] output = new int[lenght];
        for(i = 0; i < lenght; i++){
            output[i] = books.length;
        }

        return output; }
    public void closeFile() throws IOException {

      fileWriter.close();
    }
}
