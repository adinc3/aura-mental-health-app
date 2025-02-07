package com.example.aura.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatController {
    
    // Endpoint to simulate a chat response from AURA
    @PostMapping("/chat")
    public String chatWithAURA(@RequestBody String message) {
        // In a real implementation, you'd call an AI/NLP service here.
        return "AURA Response: " + message + " (this is a dummy response)";
    }
}
