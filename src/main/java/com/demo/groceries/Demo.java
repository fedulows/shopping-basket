package com.demo.groceries;

/**
 * Simple demo, which demonstrates the usage scenario based on hardcoded products.
 *
 * @author Sergei
 */
public class Demo {
    public static final Product BANANA = new Product("Banana", 40);
    public static final Product ORANGE = new Product("Orange", 50);
    public static final Product APPLE = new Product("Apple", 30);
    public static final Product LEMON = new Product("Lemon", 25);
    public static final Product PEACH = new Product("Peach", 60);


    public static void main(String[] args) {
        ShoppingBasket basket = (new ShoppingBasket())
                .addItem(BANANA, 10)
                .addItem(APPLE, 5)
                .addItem(ORANGE, 10)
                .addItem(LEMON, 10);

        System.out.println("The basket is: " + basket + ", the total is " + basket.calculateTotal());
    }
}
