import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void givenSentence_WhenContainsSad_ShouldPassTest() {
        MoodAnalyser object = new MoodAnalyser();
        String mood = object.analyseMood("this is a sad message");
        Assert.assertEquals("sad", mood);
    }
}