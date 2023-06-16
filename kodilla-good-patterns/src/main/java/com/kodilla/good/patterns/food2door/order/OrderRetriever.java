package com.kodilla.good.patterns.food2door.order;

public class OrderRetriever {

    public Order retrieve() {
        return new Order(OrderType.EXTRA_FOOD_SHOP, "Ryż biały", 332);
    }
}