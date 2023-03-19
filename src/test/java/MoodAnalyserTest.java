import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void givenSentence_WhenContainsSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser object = new MoodAnalyser();
        String mood = object.analyseMood("I am in sad mood");
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void givenSentence_WhenDoNotContainsSad_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser object = new MoodAnalyser();
        String mood = object.analyseMood("I am in any mood");
        Assert.assertEquals("happy", mood);
    }

    @Test
    public void givenSentenceInConstructor_WhenContainsSad_ShouldReturnSad() {
        MoodAnalyser object = new MoodAnalyser("I am in sad mood");
        String message = object.analyseMood();
        Assert.assertEquals("sad", message);
    }

    @Test
    public void givenSentenceInConstructor_WhenContainshappy_ShouldReturnSad() {
        MoodAnalyser object = new MoodAnalyser("I am in happy mood");
        String message = object.analyseMood();
        Assert.assertEquals("sad", message);
    }

    @Test
    public void givenSentence_WhenContainsHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser object = new MoodAnalyser();
        String message = object.analyseMood("I am in happy mood");
        Assert.assertEquals("happy", message);
    }

    @Test
    public void givenSentence_WhenPassedNull_ShouldPassFromCustom(){
        MoodAnalyser object = new MoodAnalyser();
        try {
           String message=object.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenSentence_WhenPassedEmpty_ShouldPassFromCustom(){
        MoodAnalyser object = new MoodAnalyser();
        try {
         String message=object.analyseMood("");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
