package be.digitcom.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int substract(int a, int b) {
        return a - b;
    }
}
