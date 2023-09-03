package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

final class DemoControllerTest {
    private final DemoController testObj = new DemoController(new DemoService());
    private static final String PLAYER = "PLAYER";
    @BeforeEach void beforeEach() { testObj.addPlayer(PLAYER); }
    @Test void shouldAddPlayer() {
        assertEquals(true, testObj.addPlayer("").getBody());
    }
    @Test void shouldGetPlayers() {
        assertEquals(Collections.singleton(PLAYER), testObj.getPlayers().getBody());
    }
    @Test void playerShouldExist() {
        assertEquals(true, testObj.playerExist(PLAYER).getBody());
    }
}
