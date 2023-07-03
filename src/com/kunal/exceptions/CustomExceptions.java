package com.kunal.exceptions;

public class CustomExceptions {
    public static void main(String[] args) throws AgeLessThanZeroException {

        validateAge(-1);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0) {
            throw new AgeLessThanZeroException("Are Baap re age minus me kaise de diya!");
        }
        else {
            System.out.println("Its a valid age.");
        }
    }
}
