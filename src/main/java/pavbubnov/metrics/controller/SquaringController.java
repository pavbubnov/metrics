package pavbubnov.metrics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pavbubnov.metrics.service.SquareService;

@RestController
public class SquaringController {

    private final SquareService squareService;

    public SquaringController(SquareService squareService) {
        this.squareService = squareService;
    }

    @GetMapping("/square/{number}")
    public Double getSquare(@PathVariable("number") Double number) throws InterruptedException {
        return squareService.getSquare(number);
    }

}


