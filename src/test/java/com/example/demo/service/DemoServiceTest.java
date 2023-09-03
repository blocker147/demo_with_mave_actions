package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class DemoServiceTest {
    private final DemoService testObj = new DemoService();
    private static final String PLAYER = "PLAYER";
    @BeforeEach void beforeEach() { testObj.addPlayer(PLAYER); }
    @Test void shouldAddPlayer() {
        assertTrue(testObj.addPlayer(""));
    }
    @Test void shouldGetPlayers() {
        assertEquals(1, testObj.getPlayers().size());
    }
    @Test void playerShouldExist() {
        assertTrue(testObj.playerExist(PLAYER));
    }
}
