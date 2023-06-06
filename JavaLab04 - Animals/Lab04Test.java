public class Lab04Test {
    public static void main(String[] args)
    {

        Dog dog = new Dog(12.8,70,true,"Rex",14);
        Cat cat = new Cat(3.6,57,true,false);
        Leopard leo = new Leopard(120,112,true,6);
        System.out.println(cat.getGestation());
        System.out.println(leo.getGestation());
        dog.setWeight(139);
        System.out.println(dog.getWeight());
    }
}
