import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Lab08Test {
    public static void main(String[] args) throws FileNotFoundException, OverStockException, OutOfStockException {
        HashMap<String, Product> map = new HashMap<>();

        StoreHouse store = new StoreHouse();
        Scanner sc = new Scanner(new File(args[0]));
        while(sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            int c = sc.nextInt();
            if(a.equals("define")) {
                Product p = new Product(b,c);
                map.put(b,p);
                System.out.println("Defined product " + p.getName());
            }
            else if(a.equals("order")) {
                try {
                    store.order(map.get(b), c);
                    System.out.println("Ordered " + c + " " + b);
                    System.out.println(store);
                } catch (Exception e) {
                    System.out.println("Product <" + b + "> is overstocked:");
                    System.out.println("\tthere are " + store.getStore().get(map.get(b)) + " in stock already, and additional " + c + " are supplied,");
                    System.out.println("\tbut there is room for only " + map.get(b).getMaxStock());
                }

            }
            else if(a.equals("supply")) {
                try {
                    if(map.get(b) != null) {
                        store.supply(map.get(b), c);
                        System.out.println("Supplied " + c + " " + b);
                        System.out.println(store);
                    }
                    else {
                        System.out.println("Unknown product " + b);
                    }

                } catch (Exception e) {
                    System.out.println("Product <" + b + "> is out of stock: " + c + " are needed but only " + store.getStore().get(map.get(b)) + " are in stock. ");
                }


            }
            else {
                System.out.println("Unrecognized operation " + a + "\n");
                System.out.println(store);
            }
        }
    }
}
