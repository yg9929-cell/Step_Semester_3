package assignmentproblems;

public class Shopping {
    private double[] prices;
    private int count;
    private final String cartId;
    Shopping(String id, int size) {
        cartId = id;
        prices = new double[size];
        count = 0;
    }
    void addItem(double price) {
        if (count < prices.length) {
            prices[count] = price;
            count++;
        } else {
            System.out.println("Cart is full");
        }
    }
    double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total = total + prices[i];
        }
        return total;
    }
    int getItemCount() {
        return count;
    }
    String getCartId() {
        return cartId;
    }
    public static void main(String[] args) {
        Shopping cart = new Shopping("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println("Cart ID: " + cart.getCartId());
        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item Count: " + cart.getItemCount());
    }
}