package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class DemoServiceTest {
    private final DemoService demoService = DemoService.getInstance();
    private static final String PLAYER = "PLAYER";
    @BeforeEach void beforeEach() {
        demoService.addPlayer(PLAYER);
    }
    @Test void shouldAddPlayer() {
        assertTrue(demoService.addPlayer(""));
    }
    @Test void shouldGetPlayers() {
        assertEquals(demoService.getPlayers().size(), 1);
    }
    @Test void playerShouldExist() {
        assertTrue(demoService.playerExist(PLAYER));
    }
}
