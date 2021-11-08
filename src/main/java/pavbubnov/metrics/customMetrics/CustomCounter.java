package pavbubnov.metrics.customMetrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CustomCounter {

    @Autowired
    private MeterRegistry meterRegistry;

    private Counter customCounter;

    @PostConstruct
    private void createCustomMetrics(){
        customCounter = Counter
                .builder("pavbubnov.custom.metrics")
                .register(meterRegistry);
    }

    public void increment(){
        customCounter.increment();
    }
}