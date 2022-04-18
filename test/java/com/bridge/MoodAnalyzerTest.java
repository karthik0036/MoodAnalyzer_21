package com.bridge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyzeMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyzeMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }

    // passing parameter through constructor
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyzerException {
        MoodAnalyzer moodanalyser = new MoodAnalyzer("i am Sad");
        String mood = moodanalyser.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodanalyser = new MoodAnalyzer("i am Happy");
        String mood = moodanalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenAnyMessage_ShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodanalyser = new MoodAnalyzer("fhj");
        String mood = moodanalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    // passing null

    @Test
    public void given_Null_ShouldReturnMessage() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer();
        try {
            String mood = moodanalyser.analyzeMood();
            Assert.assertEquals("Invalid Mood", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenConstructor_Null_ShouldReturnMessage() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer(null);
        try {
            String mood = moodanalyser.analyzeMood();
            Assert.assertEquals("Invalid Mood", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessageInMethod_Null_ShouldReturnMessage() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer();
        try {
            String mood = moodanalyser.analyzeMood("");
            Assert.assertEquals("Empty Mood", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_Null_ShouldReturnMessage() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer();
        try {
            String mood = moodanalyser.analyzeMood(null);
            Assert.assertEquals("Invalid Mood", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }


}
