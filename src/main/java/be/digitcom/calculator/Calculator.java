package be.digitcom.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Calculator logic
 */
@Service
public class Calculator {
    @Cacheable("sum")
    public int sum(int a, int b) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    int substract(int a, int b) {
        return a - b;
    }
}
