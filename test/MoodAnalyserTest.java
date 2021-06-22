/**
 * ************************** 
 * Purpose: Handle Exception if User Provides Invalid Mood
 *  
 * @author Piyush Shaw
 * @version 1.0
 * @since 21-06-2021
 * **************************
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
	@Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");

        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any mood");

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in happy mood");

        Assertions.assertEquals("HAPPY", mood);
    }
}
