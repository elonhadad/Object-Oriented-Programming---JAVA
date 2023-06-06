import java.io.FileNotFoundException;
import java.util.Scanner;

public class CapitalGame{
    private Capitals c = new Capitals();

    public CapitalGame() throws FileNotFoundException {
    }

    public void play(){

        System.out.println("Enter a country name (\"end\" to exit): ");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.next();
            if (a.equals("end")){
                System.out.println("Good bye!");
                break;
            }
            if (c.exactMatch(a) != null) {
                System.out.println(c.exactMatch(a));
            }
            else {
                for(String s : c.prefixMatch(a)){
                    System.out.println(c.exactMatch(s)+"\n");
                }
            }

            System.out.println("Enter a country name (\"end\" to exit): ");

        }
        sc.close();

    }

}
