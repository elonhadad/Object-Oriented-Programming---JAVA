public class Dog extends Canine{
    private String name;
    private int fleas;

    public Dog(double weight, int gestation, String name, int fleas) {
        super(weight, gestation);
        this.name = name;
        this.fleas = fleas;
    }

    public Dog(double weight, int gestation, boolean vac, String name, int fleas) {
        super(weight, gestation, vac);
        this.name = name;
        this.fleas = fleas;
    }

    public Dog(double weight, int gestation) {
        super(weight, gestation);
    }

    public void bark(){

    }

    @Override
    public String toString(){
        return "Dog [name=" + name + "fleas=" + fleas + super.toString() + "]";
    }
}
