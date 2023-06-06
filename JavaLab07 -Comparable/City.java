public class City implements Comparable<City>{
    private String name;
    private String country;
    private int population;
    private int area;

    public City(String name, String country, int population, int area) {
//        super();
        this.name = name;
        this.country = country;
        this.population = population;
        this.area = area;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (").append(country).append(")");
        sb.append(" Population: ").append(population);
        sb.append(" Area: ").append(area);

        return (sb.toString());
    }

    @Override
    public int compareTo(City e){
        return (name.compareTo(e.getName()));
    }

}
