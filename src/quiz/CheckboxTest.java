package quiz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckboxTest {

    Checkbox test;

    @Before
    public void newCheckboxQuestion() {
        test = new Checkbox("What is your name?", "Lyle");
    }

    @Test
    public void returnsCheckboxPrompt() {
        assertEquals("What is your name?", test.getPrompt(test));
    }

    @Test
    public void returnsCheckboxAnswer() {
        assertEquals("Lyle", test.getAnswer(test));
    }
}
