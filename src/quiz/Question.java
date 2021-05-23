package quiz;

import java.util.Scanner;

public abstract class Question {

    private final String prompt;
    private final String answer;
    public static int score = 0;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }

    public String getPrompt(Question question) {
        return question.prompt;
    }

    public String getAnswer(Question question) {
        return question.answer;
    }

    public static void takeTest(Question [] questions) {
        Scanner input = new Scanner(System.in);
        String aAnswer;
            for (Question question : questions) {
                    System.out.println(question.prompt);
                    aAnswer = input.nextLine();
                    if (!aAnswer.equals("")) {
                        if (aAnswer.toUpperCase().equals(question.answer)) score++;
                    }
                    System.out.println();
            }
    }

}
