public class Canine extends Mammal {
    private boolean vac;

    public Canine(double weight, int gestation) {
        this(weight, gestation , false);
    }

    public Canine(double weight, int gestation, boolean vac) {
        super(weight, gestation);
        this.vac = vac;
    }

    public boolean isVac() {
        return vac;
    }

    public void setVac(boolean vac) {
        this.vac = vac;
    }

    public void wail(){

    }

    @Override
    public String toString(){
        return "Canine [vaccinated=" + vac + "]";
    }

}