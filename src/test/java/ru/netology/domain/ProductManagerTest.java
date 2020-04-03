package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {


    @Test
    void shouldSearchByAuthor() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(2, "The Colossus of Maroussi", 100, "Henry Miller")};
        Product[] actual = manager.searchBy("Henry Miller");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByName() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(3, "The Silent World", 100, "Yves Cousteau")};
        Product[] actual = manager.searchBy("the silent world");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByProducer() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(1, "Galaxy-300", 300, "Samsung")};
        Product[] actual = manager.searchBy("samsung");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByPhoneName() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(1, "Galaxy-300", 300, "Samsung")};
        Product[] actual = manager.searchBy("Galaxy-300");
        assertArrayEquals(expected, actual);
    }


}
