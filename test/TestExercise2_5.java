import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestExercise2_5 {

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
    void dozens() {
        var pattern = Pattern.compile("^\\s*How many eggs do you have\\?\\s+Your number of eggs is (?<dozen>\\d+) dozen and (?<extra>\\d+)\\s*$");

        IntStream.range(0, 1000).forEach(i -> {
            var amount = TestHelper.random.nextInt(100);
            var userInput = String.format("%d", amount);

            TestHelper.updateSystemIn(userInput);

            Dozens.main(null);

            Matcher matcher = TestHelper.getMatcher(pattern);

            var dozen = Integer.parseInt(matcher.group("dozen"));
            var extra = Integer.parseInt(matcher.group("extra"));

            assertEquals(amount, dozen * 12 + extra, String.format("calculation invalid for %d", amount));

            TestHelper.reset();
        });
    }

    @Test
    void grossAndDozens() {
        var pattern = Pattern.compile("^\\s*How many eggs do you have\\?\\s+Your number of eggs is (?<gross>\\d+) gross, (?<dozen>\\d+) dozen, and (?<extra>\\d+)\\s*$");

        IntStream.range(0, 1000).forEach(i -> {
            var amount = TestHelper.random.nextInt(201) + 100; // 100 - 300
            var userInput = String.format("%d", amount);

            TestHelper.updateSystemIn(userInput);

            GrossAndDozens.main(null);

            Matcher matcher = TestHelper.getMatcher(pattern);

            var gross = Integer.parseInt(matcher.group("gross"));
            var dozen = Integer.parseInt(matcher.group("dozen"));
            var extra = Integer.parseInt(matcher.group("extra"));

            assertEquals(amount, gross * 144 + 12 * dozen + extra, "calculation invalid");

            TestHelper.reset();
        });
    }

}