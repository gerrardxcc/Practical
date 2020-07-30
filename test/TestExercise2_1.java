import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

class TestExercise2_1 {

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
    void printInitials() {
        var pattern = Pattern.compile("^[* \r\n]+$");

        PrintInitials.main(null);

        TestHelper.getMatcher(pattern);
    }
}