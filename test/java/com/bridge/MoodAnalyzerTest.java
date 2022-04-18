package com.bridge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyzeMood("I am in Sad mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyzeMood("I am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }
    // passing parameter through constructor
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad mood");
        String mood = moodanalyzer.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in happy mood");
        String mood = moodanalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    // passing null
    @Test
    public void givenNull_ShouldReturnHappy() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer(null);
        String mood = moodanalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNull_ShouldReturnHappy2() {
        MoodAnalyzer moodanalyser = new MoodAnalyzer();
        String mood = moodanalyser.analyzeMood(null);
        Assert.assertEquals("HAPPY", mood);
    }

}
