package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello, world!");
    }

    // Simple utility class
    public static class MyClass {
        public void printAdditionResult() {
            int a = 10;
            int b = 20;
            int result = a + b;
            System.out.println("Result: " + result);
        }
    }

    // Example error handling class
    public class ErrorHandlingClass {
        public void readFile(String filename) {
            try {
                // Add real file I/O here if needed
                // e.g., new FileReader(filename);
            } catch (Exception e) {
                System.err.println("Failed to read file: " + filename);
                e.printStackTrace(); // Proper logging instead of ignoring
            }
        }
    }

    // Simple calculation class
    public class CalculationClass {
        public int calculateSum(int a, int b) {
            return a + b;
        }
    }
}
