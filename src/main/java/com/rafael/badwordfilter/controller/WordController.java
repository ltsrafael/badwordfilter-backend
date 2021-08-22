package com.rafael.badwordfilter.controller;

import com.rafael.badwordfilter.model.Word;
import com.rafael.badwordfilter.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/word")
@CrossOrigin(origins = "*", allowedHeaders = "*",exposedHeaders = "*")
public class WordController {

    @Autowired
    private WordRepository wordRepository;

    @PutMapping
    public Word postMessage(@RequestBody Word word) {
        return wordRepository.save(word);
    }

    @GetMapping
    public List<Word> getWords() {
        return wordRepository.findAll();
    }

    @DeleteMapping("{id}")
    public void deleteWord(@PathVariable Long id) {
        wordRepository.deleteById(id);
    }


}
