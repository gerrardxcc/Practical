import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestExercise2_6 {

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
    void firstNameLastName() {
        var pattern = Pattern.compile("^\\s*Please enter your first name and last name, separated by a space\\.\\s+\\?\\s+Your first name is (?<first>\\w+), which has (?<firstCount>\\d+) characters\\.\\s+Your last name is (?<last>\\w+), which has (?<lastCount>\\d+) characters\\.\\s+Your initials are (?<initials>\\w+)\\s*$");

        var name = "Harry Potter";
        TestHelper.updateSystemIn(name);

        FirstNameLastName.main(null);

        Matcher matcher = TestHelper.getMatcher(pattern);

        var first = matcher.group("first");
        var last = matcher.group("last");
        var firstCount = Integer.parseInt(matcher.group("firstCount"));
        var lastCount = Integer.parseInt(matcher.group("lastCount"));
        var initials = matcher.group("initials");

        assertEquals(name.length(), firstCount + lastCount + 1, "name lengths invalid");
        assertEquals(initials, String.format("%s%s", first.toUpperCase().charAt(0),
                last.toUpperCase().charAt(0)), "initials invalid");
    }

}