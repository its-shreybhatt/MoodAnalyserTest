public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        if (message.contains("sad"))
            return "sad";
        return "happy";
    }

    public String analyseMood() {
        return "sad";
    }
}