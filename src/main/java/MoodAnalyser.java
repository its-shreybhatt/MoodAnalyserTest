public class MoodAnalyser {

    public String analyseMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        return "happy";
    }
}
