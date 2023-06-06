public class Prism {
    private double height;
    private Shape2D base;

    public Prism(Shape2D base, double height) {
        this.height = height;
        this.base = base;
    }


    public double volume() {
        return(base.area() * height );
    }


    @Override
    public String toString(){
        return "Prism  [height = " + height + ", base = " + base.toString() + "]" ;
    }

}
