package org.example.controller;

import org.example.model.PostData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {
    @PostMapping("/post")
    public ResponseEntity<String> postMessage(@RequestBody PostData postData) {
        // Process the received data
        return ResponseEntity.ok("Received: " + postData.getMessage());
    }
}
