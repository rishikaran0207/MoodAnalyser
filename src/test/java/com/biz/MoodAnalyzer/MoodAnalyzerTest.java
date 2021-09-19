package com.biz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    public MoodAnalyzer mood = new MoodAnalyzer();

    @Test
    public void mood_happytest() throws MoodAnalysisException {
        String message = "Im in Happy mood....";
        String expectedmessage = "HAPPY";
        String actualmessage = mood.analyseMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void mood_sadtest() throws MoodAnalysisException {
        String message = "Im in Sad mood....";
        String expectedmessage = "SAD";
        String actualmessage = mood.analyseMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void mood_nulltest() throws MoodAnalysisException {
        try {
            mood.analyseMood("");
        } catch (MoodAnalysisException exception) {
            String expectedmessage = "Empty Mood";
            Assert.assertEquals(expectedmessage,exception.value);
        }
    }
};