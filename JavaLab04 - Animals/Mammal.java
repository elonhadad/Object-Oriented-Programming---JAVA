public class Mammal {
    private double weight;
    private int gestation;

    public Mammal(double weight, int gestation) {
        this.weight = weight;
        this.gestation = gestation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getGestation() {
        return gestation;
    }

    public void setGestation(int gestation) {
        this.gestation = gestation;
    }

    public void lactate(){

    }

    @Override
    public String toString(){
        return "Mammal [weight=" + weight + ",gestation=" + gestation + "]";
    }
}
