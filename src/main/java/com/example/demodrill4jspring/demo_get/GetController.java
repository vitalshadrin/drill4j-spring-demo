package com.example.demodrill4jspring.demo_get;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GetController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/get/demo")
    @ResponseBody
    public GetObject demoBody(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return new GetObject(counter.incrementAndGet(), String.format(template, name));
    }
}
