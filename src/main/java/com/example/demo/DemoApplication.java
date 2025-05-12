package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello, world!");
    }

    public static class MyClass {
        public void printAdditionResult() {
            int a = 10;
            int b = 20;
            int result = a + b;
            System.out.println("Result: " + result);
        }
    }

    public class ErrorHandlingClass {
        public void readFile(String filename) {
            try {
                // Simulate code that might throw IOException
            } catch (java.io.IOException e) {
                System.err.println("Failed to read file: " + filename);
                e.printStackTrace(); // Proper logging instead of ignoring
            }
        }
    }

    public class CalculationClass {
        public int calculateSum(int a, int b) {
            return a + b; // Removed unused 'difference' variable
        }
    }
}
