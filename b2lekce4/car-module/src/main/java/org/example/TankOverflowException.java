package org.example;

public class TankOverflowException extends RuntimeException {
    public TankOverflowException(String message) {
        super(message);
    }
}
