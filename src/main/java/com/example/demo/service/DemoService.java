package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public final class DemoService {
    private final Set<String> players;
    public DemoService() {
        players = new HashSet<>();
    }
    public boolean addPlayer(String player) { return players.add(player); }
    public Set<String> getPlayers() { return Set.copyOf(players); }
    public boolean playerExist(String player) { return players.contains(player); }
}
