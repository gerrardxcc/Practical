import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestExercise2_2 {

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
    void rollTheDice() {
        // setup regex based on expected output
        var pattern = Pattern.compile("^\\s*The first die comes up (?<dice1>\\d)\\s+The second die comes up (?<dice2>\\d)\\s+Your total roll is (?<total>\\d+)\\s*$");

        // roll the dice 1000 times and assert values are within the correct ranges
        IntStream.range(0, 1000).forEach(i -> {

            RollTheDice.main(null);

            Matcher matcher = TestHelper.getMatcher(pattern);

            var dice1 = Integer.parseInt(matcher.group("dice1"));
            var dice2 = Integer.parseInt(matcher.group("dice2"));
            var total = Integer.parseInt(matcher.group("total"));

            assertTrue(dice1 > 0 && dice1 < 7, "dice1 invalid");
            assertTrue(dice2 > 0 && dice2 < 7, "dice2 invalid");
            assertTrue(total > 1 && total < 13, "total invalid");

            TestHelper.reset();
        });
    }

}