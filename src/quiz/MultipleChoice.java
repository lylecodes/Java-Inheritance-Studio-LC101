package quiz;

public class MultipleChoice extends Question {
    private static final String answerA = "A";
    private static final String answerB = "B";
    private static final String answerC = "C";

    public static MultipleChoice[] questions = {
            new MultipleChoice("""
                    What color is the sky?
                    a. Blue
                    b. Red
                    c. Green""", answerA),
            new MultipleChoice("""
                    What would a monkey typically eat?
                    a. Hamburger
                    b. Banana
                    c. Yogurt""", answerB),
            new MultipleChoice("""
                    Where do monkeys live?
                    a. Your house
                    b. Grocery Store
                    c. Jungle""", answerC)
    };

    public MultipleChoice(String prompt, String answer) {
        super(prompt, answer);
    }
}




