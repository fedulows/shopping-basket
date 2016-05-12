package com.demo.groceries;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/**
 * A shopping basket which contains the list of products and the quantities.
 * Note: this class is not thread-safe.
 *
 * @author Sergei
 */
public class ShoppingBasket {
    /* Mapping: product -> quantity */
    private final Map<Product, Integer> items = new HashMap<>();


    /**
     * Adds product and quantity to this shopping basket. 
     * For convenience building the object returns the reference to this basket.
     *
     * @param product  the product to add
     * @param quantity  the products quantity
     *
     * @return reference to this shopping basket
     */
    public ShoppingBasket addItem(Product product, int quantity) {
        if (quantity < 1) {
            throw new IllegalArgumentException("The quantity should be positive and non-zero");
        }

        this.items.put(product, quantity);
        return this;
    }


    /**
     * Calculates total for the item in this shopping basket.
     *
     * @return big-decimal representing total.
     */
    public BigDecimal calculateTotal() {
        long total = 0;
        for (Entry<Product, Integer> entry : items.entrySet()) {
            Product item = entry.getKey();
            int quantity = entry.getValue();
            total += item.getPrice() * quantity;
        }

        return BigDecimal.valueOf(total, 2);
    }


    @Override
    public String toString() {
        return this.items.toString();
    }
}
