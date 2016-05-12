package com.demo.groceries;

import org.junit.Assert;
import org.junit.Test;


/**
 * A simple test-case which test the calculation logic based on hardcoded products and prices.
 *
 * @author Sergei
 */
public class ShoppingBasketTest {
    private static final double DOUBLE_COMPARE_DELTA = 0.0000001d;

    @Test
    public void testCalculation() {
        ShoppingBasket basket = (new ShoppingBasket())
                .addItem(Demo.BANANA, 10)
                .addItem(Demo.APPLE, 5);
        Assert.assertEquals("the expected price 5.50 doesn't match", 
                5.5d, basket.calculateTotal().doubleValue(), DOUBLE_COMPARE_DELTA);

        basket = (new ShoppingBasket())
                .addItem(Demo.BANANA, 1)
                .addItem(Demo.ORANGE, 1)
                .addItem(Demo.APPLE, 1)
                .addItem(Demo.LEMON, 1)
                .addItem(Demo.PEACH, 1);
        Assert.assertEquals("the expected price 2.05 doesn't match", 
                2.05d, basket.calculateTotal().doubleValue(), DOUBLE_COMPARE_DELTA);

        basket = (new ShoppingBasket())
                .addItem(Demo.ORANGE, 1000)
                .addItem(Demo.LEMON, 2000);
        Assert.assertEquals("the expected price 1000.00 doesn't match", 
                1000.00d, basket.calculateTotal().doubleValue(), DOUBLE_COMPARE_DELTA);
    }
}
