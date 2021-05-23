package quiz;

public class TrueFalse extends Question {
    private static final String aTrue = "T";
    private static final String aFalse = "F";

    public TrueFalse(String prompt, String answer) {
        super(prompt, answer);
    }

    public static TrueFalse[] questions = {
            new TrueFalse("2 + 2 = 5\nT. True\nF. False", aFalse),
            new TrueFalse("6 + 4 = 10\nT. True\nF. False", aTrue),
            new TrueFalse("3 + 7 = 10\nT. True\nF. False", aTrue)
    };
}
