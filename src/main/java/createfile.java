import java.util.Formatter;

public class createfile {

    public Formatter x;

    public void openFile(){
        try {
            x=new Formatter("Books.txt");
        }
        catch (Exception e){
            System.out.println("There is a problem with opening Books.txt");
        }
    }

    public void addRecord(){
        x.format("%s %s %s %s %s\n", "TITLE", "FIRSTNAME", "LASTNAME", "BOOKSTAND", "SHELF");
    }

    public void closeFile(){
        x.close();
    }
}
