package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public final class DemoService {
    private final Set<String> players;
    private static final int SIZE_LIMIT = 10;
    public DemoService() {
        players = new HashSet<>();
    }
    public boolean addPlayer(String player) {
        if (players.size() >= SIZE_LIMIT) throw new IllegalStateException("Limited amount of players are supported.");
        if (players.add(player)) return true;
        else throw new IllegalStateException("Player cannot be added because must be unique.");
    }
    public Set<String> getPlayers() { return Set.copyOf(players); }
    public boolean playerExist(String player) { return players.contains(player); }
    public void clearPlayers() {
        players.clear();
    }
}
