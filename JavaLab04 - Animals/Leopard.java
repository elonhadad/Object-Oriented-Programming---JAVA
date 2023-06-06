public class Leopard extends Feline{
    private int mates;

    public Leopard(double weight, int gestation) {
        this(weight, gestation, true, 0);
    }

    public Leopard(double weight, int gestation, boolean spots, int mates) {
        super(weight, gestation, spots);
        this.mates = mates;
    }

    public Leopard(double weight, int gestation, boolean spots) {
        super(weight, gestation, spots);
    }

    public int getMates() {
        return mates;
    }

    public void setMates(int mates) {
        this.mates = mates;
    }

    public void roar(){

    }

    public void prey(){

    }

    @Override
    public String toString(){
        return "Leopard [mates=" + mates + super.toString();
    }
}
