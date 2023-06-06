public class Lab07Test {

    public static void main(String[] args) {
        Cities cities = new Cities();
        cities.listByDensity();
        cities.listByPopulation();
        cities.listAlphabetically();
        cities.listByCountry( "China" );
    }
}
