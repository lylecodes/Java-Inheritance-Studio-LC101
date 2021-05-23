package quiz;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int numberOfQuestions = MultipleChoice.questions.length + TrueFalse.questions.length + Checkbox.questions.length;
        System.out.print("===========================\nEnter any key to begin quiz\n===========================\n");

        if (input.hasNextLine()) {
            System.out.println("*Enter the corresponding letter or number of answer (case insensitive)*");

            MultipleChoice.takeTest(MultipleChoice.questions);
            TrueFalse.takeTest(TrueFalse.questions);
            Checkbox.takeTest(Checkbox.questions);

            System.out.println("Final Score: " + Question.score + "/" + numberOfQuestions);
        }

    }
}
