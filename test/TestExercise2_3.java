import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestExercise2_3 {

    @BeforeAll
    static void setup() {
        TestHelper.setup();
    }

    @AfterEach
    void cleanup() {
        TestHelper.cleanup();
    }

    @AfterAll
    static void teardown() {
        TestHelper.teardown();
    }

    @Test
    void greeting() {
        var pattern = Pattern.compile("^\\s*Please enter your name:\\s+Hello, (?<upperCaseName>[A-Z]+), nice to meet you!\\s*$");

        TestHelper.updateSystemIn("Jason");

        Greeting.main(null);

        Matcher matcher = TestHelper.getMatcher(pattern);

        var upperCaseName = matcher.group("upperCaseName");

        assertTrue("Jason".toUpperCase().equalsIgnoreCase(upperCaseName), "case mismatch");
    }
}