public class OutOfStockException extends Exception {
    private static final long serialVersionUID = 1L;
    private Product product;
    private int needed;

    public OutOfStockException() {
    }

    public OutOfStockException(String message) {
        super(message);
    }

    public OutOfStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfStockException(Throwable cause) {
        super(cause);
    }

    public OutOfStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OutOfStockException(Product product, int needed) {
        this.product = product;
        this.needed = needed;
    }


}
