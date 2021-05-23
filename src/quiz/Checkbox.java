package quiz;

public class Checkbox extends Question {

    public Checkbox(String prompt, String answer) {
        super(prompt, answer);
    }

    public static Checkbox[] questions = {
        new Checkbox("What is 5 * 5?\n1. 34\t2. 20\n3. 22\t4. 25", "1"),
        new Checkbox("What is 3 * 7?\n1. 20\t2. 33\n3. 21\t4. 24", "2"),
        new Checkbox("What is 4 * 9?\n1. 34\t2. 36\n3. 29\t4. 35", "3"),
        new Checkbox("What is 9 * 9?\n1. 81\t2. 82\n3. 85\t4. 84", "4")
};


}
