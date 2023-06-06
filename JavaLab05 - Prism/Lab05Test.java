public class Lab05Test {

    public static void main(String[] args) {
	Circle c = new Circle(1.784);
    Square s = new Square(2.828);
    Prism p_1 = new Prism(c, 3);
    Prism p_2 = new Prism(s, 3.75);

    System.out.println(p_1);
    System.out.println("volume: " + p_1.volume());
    System.out.println();
    System.out.println(p_2);
    System.out.println("volume: " + p_2.volume());

    }

}

