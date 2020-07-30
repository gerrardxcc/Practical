import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestExercise2_7 {

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
    void findAverage() throws FileNotFoundException {
        var pattern = Pattern.compile("^\\s*The average grade for (?<name>[ \\w]+) was (?<grade>\\d+\\.?\\d*)\\s*$");

        TestHelper.updateSystemIn("");

        FindAverage.main(null);

        Matcher matcher = TestHelper.getMatcher(pattern);

        var name = matcher.group("name");
        var grade = matcher.group("grade");

        var scanner = new Scanner(new File("resources/testdata.txt"));
        assertEquals(name, scanner.nextLine().trim(), "name invalid");

        var sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        var expectedGrade = String.format("%.1f", sum / 3.0);

        assertEquals(expectedGrade, grade, "grade invalid");
    }

}