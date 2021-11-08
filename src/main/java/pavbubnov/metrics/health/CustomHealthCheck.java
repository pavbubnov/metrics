package pavbubnov.metrics.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator {

    private int i = 0;

    @Override
    public Health health() {
        i++;
        if (i<3) {
            return Health.up()
                    .build();
        } else return Health.down()
                .build();
    }
}