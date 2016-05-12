package com.demo.groceries;

import java.math.BigDecimal;


/**
 * A product containing the item's name and the price in pennies.
 *
 * @author Sergei
 */
public class Product {
    /* The items name */
    private final String name;

    /* The price in pennies*/
    private final int price;


    /**
     * @param price  the price is given in pennies.
     */
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.name).append('[').append(BigDecimal.valueOf(this.price, 2)).append(']');

        return result.toString();
    }
}
