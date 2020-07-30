import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestExercise2_4 {

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
    void countChange() {
        var pattern = Pattern.compile("^\\s*Enter the number of 5c: {3}Enter the number of 10c: {2}Enter the number of 20c: {2}Enter the number of 50c: {2}Enter the number of \\$1: {3}Enter the number of \\$2: {3}\\s+The total in dollars is \\$(?<total>\\d+\\.\\d\\d)\\s*$");

        var amounts = new int[6];
        IntStream.range(0, amounts.length).forEach(i -> amounts[i] = TestHelper.random.nextInt(11));

        var builder = new StringBuilder();
        builder.append(amounts[0]);
        IntStream.range(1, amounts.length).forEach(i -> builder.append("\n").append(amounts[i]));
        var userInput = builder.toString();

        TestHelper.updateSystemIn(userInput);

        CountChange.main(null);

        Matcher matcher = TestHelper.getMatcher(pattern);

        var total = Double.parseDouble(matcher.group("total"));

        var ratios = new double[]{0.05, 0.1, 0.2, 0.5, 1, 2};
        var expectedTotal = IntStream.range(0, amounts.length).mapToDouble(i -> amounts[i] * ratios[i]).sum();

        assertEquals(expectedTotal, total, "summation failed");
    }
}