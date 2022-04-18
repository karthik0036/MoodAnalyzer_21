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

    public String analyzeMood(String message) {
        this.message = message;
        return analyzeMood();
    }
    public static String analyzeMood() {   // Analysing mood using method analyse mood with parameter passed
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
