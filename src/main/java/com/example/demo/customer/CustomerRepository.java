package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123"),
                new Customer(2L, "Dave Grohl", "password123"),
                new Customer(3L, "Lady Gaga", "password123"),
                new Customer(4L, "Beyonce", "password123")
        );
    }
}
