package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/players")
public final class DemoController {
    private final DemoService demoService;
    public DemoController(@Autowired DemoService demoService) { this.demoService = demoService; }
    @PostMapping public ResponseEntity<Boolean> addPlayer(@RequestParam String player) {
        return new ResponseEntity<>(demoService.addPlayer(player), HttpStatus.CREATED);
    }
    @PostMapping("/clear") public void clearPlayers() { demoService.clearPlayers(); }
    @GetMapping public ResponseEntity<Set<String>> getPlayers() {
        return new ResponseEntity<>(demoService.getPlayers(), HttpStatus.OK);
    }
    @GetMapping("/exist") public ResponseEntity<Boolean> playerExist(@RequestParam String player) {
        return new ResponseEntity<>(demoService.playerExist(player), HttpStatus.OK);
    }
}
