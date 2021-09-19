package com.biz.MoodAnalyzer;

public class MoodAnalyzer {
    public static String AnalysehappyMood(String message) {
        if (message.contains("any") || message.contains("ANY")) {
            return "HAPPY";
        } else
            return "SAD";
    }
    public static String AnalysesadMood(String message) {
        if (message.contains("sad") || message.contains("SAD")) {
            return "SAD";
        } else
            return "HAPPY";
    }
}