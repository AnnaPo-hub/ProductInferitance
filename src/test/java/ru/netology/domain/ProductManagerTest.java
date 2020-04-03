package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    Repository repository = new Repository();
    ProductManager manager = new ProductManager(repository);

    @Test
    void shouldSearchByAuthor() {
        Product[] expected = {new Book(2, "The Colossus of Maroussi", 100, "Henry Miller")};
        Product[] actual = manager.searchBy("Henry Miller");
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldSearchByName() {
        Product[] expected = {new Book(3, "The Silent World", 100, "Yves Cousteau")};
        Product[] actual = manager.searchBy("The Silent World");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByProducer() {
        Product[] expected = {new Smartphone(1, "Galaxy-300", 300, "Samsung")};
        Product[] actual = manager.searchBy("Samsung");
        assertArrayEquals(expected, actual);
    }


}
