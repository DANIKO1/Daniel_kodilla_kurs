package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Tomasz", "Smith");

        Product product = new Product("0001", "Kosiarka", 1000 );

        return new OrderRequest(user, product);
    }
}
