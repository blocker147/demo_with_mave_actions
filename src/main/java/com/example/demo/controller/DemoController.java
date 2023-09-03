package com.example.demo.controller;

import com.example.demo.service.DemoService;
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
    private static DemoController demoController;
    private final DemoService demoService;
    private DemoController() { demoService = DemoService.getInstance(); }
    public static DemoController getInstance() {
        if (demoController == null) {
            demoController = new DemoController();
        }
        return demoController;
    }
    @PostMapping public ResponseEntity<Boolean> addPlayer(@RequestParam String player) {
        return ResponseEntity.ofNullable(demoService.addPlayer(player));
    }
    @GetMapping public ResponseEntity<Set<String>> getPlayers() {
        return ResponseEntity.ofNullable(demoService.getPlayers());
    }
    @GetMapping("/exist") public ResponseEntity<Boolean> playerExist(@RequestParam String player) {
        return ResponseEntity.ofNullable(demoService.playerExist(player));
    }
}
