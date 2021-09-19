package com.biz.MoodAnalyzer;

public class MoodAnalyzer {


    public static String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains("any") || message.contains("ANY") || message.contains("Any")||message.contains("happy") || message.contains("HAPPY") || message.contains("Happy")) {
                return "HAPPY";
            } else if (message.contains("SAD") || message.contains("Sad") || message.contains("sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }

    }
}