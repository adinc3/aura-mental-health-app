package com.example.aura.controller;

import com.example.aura.model.Mood;
import com.example.aura.repository.MoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MoodController {
    
    @Autowired
    private MoodRepository moodRepository;
    
    // Endpoint to log a new mood
    @PostMapping("/logMood")
    public Mood logMood(@RequestBody Mood mood) {
        return moodRepository.save(mood);
    }
    
    // Endpoint to retrieve all mood entries
    @GetMapping("/getMoodHistory")
    public List<Mood> getMoodHistory() {
        return moodRepository.findAll();
    }
}
