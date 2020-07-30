import textio.TextIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.fail;

public class TestHelper {
    private static PrintStream originalOutput;
    private static InputStream originalInput;
    private static ByteArrayOutputStream outputStream;
    static final Random random = new Random();

    static Matcher getMatcher(Pattern pattern) {
        var result = outputStream.toString();
        var matcher = pattern.matcher(result);
        if (!matcher.matches()) fail("formatting doesn't match requirements");

        return matcher;
    }

    static void updateSystemIn(String userInput) {
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        TextIO.readStream(System.in);
    }

    static void setup() {
        originalInput = System.in;
        originalOutput = System.out;

        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    static void cleanup() {
        System.setIn(originalInput);
        outputStream.reset();
    }

    static void teardown() {
        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    public static void reset() {
        outputStream.reset();
    }
}