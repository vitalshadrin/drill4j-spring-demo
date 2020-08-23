package com.example.demodrill4jspring.demo_post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PostController {
    @PostMapping("/post/demo")
    public ResponseEntity demoBody(@RequestBody(required = false) PostObject body) {
        if (!body.getLogin().equals("test") && !body.getPassword().equals("test")) {
            return ResponseEntity.status(403).build();
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
