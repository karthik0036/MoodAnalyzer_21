package com.bridge;

import java.util.Locale;

public class MoodAnalyzer {

    private static String message;

    //constructor return the message- parameterised constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
    }

    public String analyzeMood(String message) throws MoodAnalyzerException {
        this.message = message;
        return analyzeMood();
    }
    public static String analyzeMood() throws MoodAnalyzerException {   // Analyzing mood using method analyse mood with parameter passed
        try {
            if (message.length() == 0) {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "Empty mood");
            }
            if (message.toLowerCase().contains("sad")) {
                System.out.println("SAD");
                return "SAD";
            } else {
                System.out.println("HAPPY");
                return "HAPPY";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL, "Invalid mood");
        }
    }
}
