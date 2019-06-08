package io.picos.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

@RestController
public class SleepRestController {

    @GetMapping("/sleep")
    @ResponseStatus(HttpStatus.OK)
    public void sleep(@ModelAttribute int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

