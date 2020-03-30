package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldMatchesByAuthor() {
        Book book = new Book(3, "The Silent World", 100, "Yves Cousteau");
        assertEquals(true, book.matches("Yves Cousteau"));

    }

    @Test
    void shouldMatchesByName() {
        Book book = new Book(3, "The Silent World", 100, "Yves Cousteau");
        assertEquals(true, book.matches("The Silent World"));
    }

}