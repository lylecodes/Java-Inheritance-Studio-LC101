package quiz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrueFalseTest {

    MultipleChoice test;

    @Before
    public void newMultipleChoiceQuestion() {
        test = new MultipleChoice("What is your name?", "Lyle");
    }

    @Test
    public void returnsMultipleChoicePrompt() {
        assertEquals("What is your name?", test.getPrompt(test));
    }

    @Test
    public void returnsMultipleChoiceAnswer() {
        assertEquals("Lyle", test.getAnswer(test));
    }
}
