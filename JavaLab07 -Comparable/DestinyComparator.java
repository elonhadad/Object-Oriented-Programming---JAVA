import java.util.Comparator;
public class DestinyComparator implements Comparator<City> {

    public int compare(City c1,City c2){
        double density1 = (double) c1.getPopulation() / (double) c1.getArea();
        double density2 = (double) c2.getPopulation() / (double) c2.getArea();
        if(density1 < density2)
            return( -1 );
        else if(density1 > density2)
            return(1);
        else
            return(0);
    }
}
