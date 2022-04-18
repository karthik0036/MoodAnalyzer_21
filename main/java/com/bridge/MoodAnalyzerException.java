package com.bridge;

public class MoodAnalyzerException extends Exception {
    public String message;

    enum ExceptionType {
        EMPTY, NULL;
    }

    ExceptionType type;

    public MoodAnalyzerException(ExceptionType type, String message) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
