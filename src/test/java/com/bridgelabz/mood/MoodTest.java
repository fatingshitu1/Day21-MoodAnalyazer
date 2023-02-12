package com.bridgelabz.mood;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodTest {
    @Test
    public void whenGivenMoodShouldReturnSAD() {
        MoodAnalyazer moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void whenGivenAnyMoodShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);
    }
}
