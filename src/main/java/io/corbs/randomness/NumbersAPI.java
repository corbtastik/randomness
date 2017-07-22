package io.corbs.randomness;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NumbersAPI {

    private final Random random = new Random();

    @GetMapping("/random/int")
    public Integer getRandomInt() {
        return random.nextInt();
    }
}
