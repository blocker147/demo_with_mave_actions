package com.example.demo.service;

import java.util.HashSet;
import java.util.Set;

public final class DemoService {
    private static DemoService demoService;
    private final Set<String> players;
    private DemoService() {
        players = new HashSet<>();
    }
    public static DemoService getInstance() {
        if (demoService == null) {
            demoService = new DemoService();
        }
        return demoService;
    }
    public boolean addPlayer(String player) { return players.add(player); }
    public Set<String> getPlayers() { return Set.copyOf(players); }
    public boolean playerExist(String player) { return players.contains(player); }
}
