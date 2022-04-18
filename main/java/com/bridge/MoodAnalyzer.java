package com.bridge;

import java.util.Locale;

public class MoodAnalyzer {
    // Analysing mood using method analyse mood with parameter passed
    public static String analyzeMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
