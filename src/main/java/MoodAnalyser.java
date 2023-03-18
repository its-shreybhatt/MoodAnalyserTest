public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        try {
            if (message.contains("sad"))
                return "sad";
            return "happy";
        }catch (NullPointerException result){
            return "happy";
        }
    }

    public String analyseMood() {
        return "sad";
    }
}