import java.io.File;
import java.util.Scanner;

public class readfile {
    private Scanner x;

    public void openFile(){
        try {
            x = new Scanner(new File("Books.txt"));
        }
        catch (Exception e){
            System.out.println("There is a problem with opening Books.txt");
        }
    }

    public void readFile(){
        while (x.hasNext()){
            String a=x.next();
            String b=x.next();
            String c=x.next();
            String d=x.next();
            String e=x.next();

            System.out.printf("%s %s %s %s %s\n",a,b,c,d,e);
        }
    }

    public void closeFile(){
        x.close();
    }
}
