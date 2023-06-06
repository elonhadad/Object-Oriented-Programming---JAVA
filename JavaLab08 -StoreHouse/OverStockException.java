public class OverStockException extends Exception {
    private static final long serialVersionUID = 1L;
    private Product product = null;
    private int needed;

    public OverStockException() {

    }

    public OverStockException(String message) {
        super(message);
    }

    public OverStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public OverStockException(Throwable cause) {
        super(cause);
    }

    public OverStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OverStockException(Product product, int needed) {
        this.product = product;
        this.needed = needed;
    }
}
