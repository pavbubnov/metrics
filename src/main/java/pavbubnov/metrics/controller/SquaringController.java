package pavbubnov.metrics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquaringController {

    @GetMapping("/square/{number}")
    public Double getSquare(@PathVariable("number") Double number) {
        return Math.pow(number, 2);
    }

}


