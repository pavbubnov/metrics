package pavbubnov.metrics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SquaringController {

    @GetMapping("/square/{number}")
    public Double getSquare(@PathVariable("number") Double number) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return Math.pow(number, 2);
    }

}


