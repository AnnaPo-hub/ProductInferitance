package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {



    @Test
    void searchBy() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        manager.searchBy("Canada");



    }
}