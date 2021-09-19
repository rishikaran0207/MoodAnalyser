package com.biz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    public MoodAnalyzer mood = new MoodAnalyzer()

    @Test
    public void moodhappytest() {
        String message = "Im in any mood...";
        String expectedmessage = "happy";
        String actualmessage = mood.AnalysehappyMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void moodsadtest() {
        String message = "Im in sad mood...";
        String expectedmessage = "sad";
        String actualmessage = mood.AnalysesadMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }
}
