package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

final class DemoControllerTest {
    private final DemoController demoController = DemoController.getInstance();
    private static final String PLAYER = "PLAYER";
    @Test void shouldAddPlayer() {
        assertEquals(true, demoController.addPlayer(PLAYER).getBody());
    }
    @Test void shouldGetPlayers() {
        assertEquals(Collections.singleton(PLAYER), demoController.getPlayers().getBody());
    }
    @Test void playerShouldExist() {
        assertEquals(true, demoController.playerExist(PLAYER).getBody());
    }
}