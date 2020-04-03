package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repo = new Repository();


    @Test
    void shouldRemoveByIDIfExists() {
        repo.removeByID(4);
        Product[] expected = {new Book(1, "In Search of Lost Time", 200, "Proust"),
                new Book(2, "The Colossus of Maroussi", 100, "Henry Miller"),
                new Book(3, "The Silent World", 100, "Yves Cousteau"),
                new Smartphone(5, "X-3", 300, "Xiaomi"),
                new Smartphone(6, "MN-54", 50, "Russian Phones")};
        assertArrayEquals(expected, repo.getAll());
    }


    @Test
    void shouldRemoveByIDIfDoesNotExist() {
        Repository repo = new Repository();
        assertThrows(NotFoundException.class, () -> repo.removeByID(10));
    }
}
