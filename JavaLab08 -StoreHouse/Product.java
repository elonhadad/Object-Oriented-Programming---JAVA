public class Product {
    private String name;
    private int maxStock;

    public Product() {
    }

    public Product(String name, int maxStock) {
        this.name = name;
        this.maxStock = maxStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", maxStock=" + maxStock +
                '}';
    }
}
