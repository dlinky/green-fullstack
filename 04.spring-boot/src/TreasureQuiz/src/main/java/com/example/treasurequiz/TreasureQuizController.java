package com.example.treasurequiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TreasureQuizController {
    @GetMapping("/")
    public String getMethodName() {
        return new String("index");
    }
    
}
