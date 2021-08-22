package com.rafael.badwordfilter.controller;

import com.rafael.badwordfilter.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
@CrossOrigin(origins = "*", allowedHeaders = "*",exposedHeaders = "*")
public class MessageController {

    @PostMapping
    public Message postMessage(@RequestBody Message message) {
        System.out.println("Mensagem recebida!");
        return message;
    }
}
