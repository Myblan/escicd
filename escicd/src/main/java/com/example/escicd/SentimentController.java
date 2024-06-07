package com.example.escicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/sentiment")
public class SentimentController {

    @GetMapping
    public List<Sentiment> getSentiment(){
          return Arrays.asList(new Sentiment(1,"positif",1),
                  new Sentiment(2,"negatif",0));
    }
}
