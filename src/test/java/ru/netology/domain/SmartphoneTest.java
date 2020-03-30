package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void shouldMatchesByProducer() {
        Smartphone smartphone = new Smartphone(2, "X-3", 300, "Xiaomi");
        assertEquals(true, smartphone.matches("Xiaomi"));
    }

    @Test
    void shouldMatchesByName() {
        Smartphone smartphone = new Smartphone(2, "X-3", 300, "Xiaomi");
        assertEquals(false, smartphone.matches("x-w"));
    }

}