package pavbubnov.metrics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pavbubnov.metrics.customMetrics.CustomCounter;

import java.util.concurrent.TimeUnit;

@Service
public class SquareService {

    @Autowired
    CustomCounter customCounter;

    public Double getSquare(Double number) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        customCounter.increment();
        return Math.pow(number, 2);
    }
}
