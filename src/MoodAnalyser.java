
public enum ExceptionTypeClass{
    NULLEXCEPTION("Mood cannot be null"); 
    private String notice;

    ExceptionTypeClass(String notice){
        this.notice = notice;
    }
    public String getNotice(){
        return this.notice;
    }
}
public class MoodAnalyser {
	private String message;

    public String MoodAnalyser(String message) {
        return this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else if (message.contains(""))
                throw new MoodAnalyserException(ExceptionTypeClass.EMPTYEXCEPTION);
            else
                return "HAPPY";

        }catch (NullPointerException e){
	        throw new MoodAnalyserException(ExceptionTypeClass.NULLEXCEPTION);
        }
    }
}
