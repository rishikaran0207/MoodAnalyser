package com.biz.MoodAnalyzer;

public class MoodAnalysisException extends Throwable {

    public int value;

    public class MoodAnalysisException extends Exception {
        public String value;

        public MoodAnalysisException(String message) {
            super(message);
        }
    }
}
