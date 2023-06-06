public class Feline extends Mammal{
    private boolean spots;

    public Feline(double weight, int gestation) {
        this(weight, gestation, true);
    }

    public Feline(double weight, int gestation, boolean spots) {
        super(weight, gestation);
        this.spots = spots;
    }

    public boolean isSpots() {
        return spots;
    }

    public void setSpots(boolean spots) {
        this.spots = spots;
    }

    public void  climb(){

    }

    @Override
    public String toString(){
        return "Feline [spots=" + spots + "]";
    }
}
