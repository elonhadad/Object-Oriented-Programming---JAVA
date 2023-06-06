import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Cities implements Comparator<City> {
    private SortedSet<City> cityList;

    public Cities() {
        this.cityList = new TreeSet<City>();
        init("cities.txt");
    }

    private void init(String file) {
        try {
            Scanner sc = new Scanner(new File("cities.txt"));
            sc.useDelimiter("[\t\n]");
            String name = null;
            String country = null;
            int population = 0;
            int area = 0;

            while (sc.hasNext()) {
                    name = sc.next();
                    country = sc.next();
                    population = sc.nextInt();
                    area = sc.nextInt();

                City city = new City(name, country, population, area);
                cityList.add(city);
            }
            sc.close();
        }
        catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
    }
    public void listAlphabetically() {
        System.out.println("\nCity list by Alphabetic:\n");

        for (City c : cityList)
            System.out.println(c);
    }

    public void listByPopulation() {
        System.out.println("\nCity List by Population:\n");

        SortedSet<City> ss = new TreeSet<City> (this);

        for(City c : cityList)
            ss.add(c);
        for(City c : ss)
            System.out.println(c);
    }

    public void listByDensity() {
        System.out.println("\nCity list by Density:\n");

        SortedSet<City> ss = new TreeSet<City> (new DestinyComparator());

        for(City c : cityList)
            ss.add( c );

        for (City c : ss)
            System.out.println(c + " Density: " + c.getPopulation()/c.getArea());


    }

        public void listByCountry(String country){
        System.out.println( "\nCities In " + country + ":\n");

        Iterator<City> it = cityList.iterator();

        while(it.hasNext()) {
            City c = it.next();
            if (c.getCountry().equals(country))
                System.out.println(c);
        }

    }

    @Override
    public int compare(City c1, City c2) {
        int res = c2.getPopulation() - c1.getPopulation();
        return res != 0 ? res: 1;
    }
}
