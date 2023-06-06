import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Capitals {
    private Map<String, String> capitals = new HashMap<String, String>();

    public Capitals() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("capitals.txt"));
        sc.useDelimiter( "[;\n]" );

        int count = 0;

        while(sc.hasNext())
        {
            String country = sc.next();
            String capital = sc.next();
            count++;
            capitals.put(country, capital);

        }
        System.out.println(count + " records read.");
    }

    public String exactMatch(String country){
        if (capitals.get(country) == null){
            return null;
        }
        return "The capital of " + country + " is "+ capitals.get(country);
    }

    public String[] prefixMatch(String prefix){
        List<String> list = new ArrayList<String>();
        String lowerPrefix = prefix.toLowerCase();

        for(String str : capitals.keySet()) {
            if(str.toLowerCase().startsWith(lowerPrefix))
                list.add(str);
        }
        return list.toArray(new String[list.size()]);
    }
}
