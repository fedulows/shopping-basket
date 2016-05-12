package com.demo.groceries;

import org.junit.Assert;
import org.junit.Test;


/**
 * A simple test-case which demonstrates the usage scenario based on hard-coded products and prices.
 *
 * @author Sergei
 */
public class ShoppingBasketTest {
    private static final double DOUBLE_COMPARE_DELTA = 0.0000001d;
    private final Product BANANA = new Product("Banana", 40);
    private final Product ORANGE = new Product("Orange", 50);
    private final Product APPLE = new Product("Apple", 30);
    private final Product LEMON = new Product("Lemon", 25);
    private final Product PEACH = new Product("Peach", 60);


    @Test
    public void testCalculation() {
        ShoppingBasket basket = (new ShoppingBasket())
                .addItem(BANANA, 10)
                .addItem(APPLE, 5);
        Assert.assertEquals("the expected price 5.50 doesn't match", 
                5.5d, basket.calculateTotal().doubleValue(), DOUBLE_COMPARE_DELTA);

        basket = (new ShoppingBasket())
                .addItem(BANANA, 1)
                .addItem(ORANGE, 1)
                .addItem(APPLE, 1)
                .addItem(LEMON, 1)
                .addItem(PEACH, 1);
        Assert.assertEquals("the expected price 2.05 doesn't match", 
                2.05d, basket.calculateTotal().doubleValue(), DOUBLE_COMPARE_DELTA);

        basket = (new ShoppingBasket())
                .addItem(ORANGE, 1000)
                .addItem(LEMON, 2000);
        Assert.assertEquals("the expected price 1000.00 doesn't match", 
                1000.00d, basket.calculateTotal().doubleValue(), DOUBLE_COMPARE_DELTA);
    }
}
