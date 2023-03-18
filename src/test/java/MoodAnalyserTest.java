import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void givenSentence_WhenContainsSad_ShouldReturnSad() {
        MoodAnalyser object = new MoodAnalyser();
        String mood = object.analyseMood("I am in sad mood");
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void givenSentence_WhenDoNotContainsSad_ShouldReturnHappy() {
        MoodAnalyser object = new MoodAnalyser();
        String mood = object.analyseMood("I am in any mood");
        Assert.assertEquals("happy", mood);
    }
}
