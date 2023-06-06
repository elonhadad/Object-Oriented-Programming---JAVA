import java.util.HashMap;
import java.util.Map;

public class StoreHouse {
    private final Map<Product, Integer> store;

    public StoreHouse() {
        store = new HashMap<>();
    }

    public StoreHouse(Map<Product, Integer> store) {
        this.store = store;
    }

    public Map<Product, Integer> getStore() {
        return store;
    }


    public void order(Product product, int quantity) throws OverStockException {
        if(store.get(product) == null) {
            if(quantity <= product.getMaxStock()) {
                store.put(product, quantity);
            }
            else {
                throw new OverStockException();
            }
        }
        else if(quantity <= product.getMaxStock()) {
            if((store.get(product) + quantity) > product.getMaxStock()) {
                throw new OverStockException();
            }
            else {
                store.put(product, store.get(product) + quantity);
            }

        }
        else {
            throw new OverStockException();
        }
    }

    public void supply(Product product, int quantity) throws OutOfStockException {
        if(store.get(product) != null) {
            if((store.get(product) - quantity) >= 0 ){
                store.put(product, store.get(product)-quantity);
            }
            else {
                throw new OutOfStockException();
            }
        }
        else {
            throw new OutOfStockException();
        }
    }

    @Override
    public String toString() {
        System.out.println("StoreHouse:");
        int i = 0;
        for(Product key : store.keySet()) {
            i++;
            System.out.println("\t" + i + "." + key.getName() + " - " + store.get(key));
        }

        return "end of list\n";
    }

}
