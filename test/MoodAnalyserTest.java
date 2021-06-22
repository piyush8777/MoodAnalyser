/**
 * ************************** 
 * Purpose: Given a message ability to analyse Happy or Sad Mood
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
	        String mood = moodAnalyser.analyseMood("This is sad message");

	        Assertions.assertEquals("SAD", mood);
	    }
}
