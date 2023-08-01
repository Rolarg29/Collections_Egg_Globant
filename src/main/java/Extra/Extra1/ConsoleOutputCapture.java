package Extra.Extra1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleOutputCapture {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outputStream);

    public void start() {
        System.setOut(printStream);
    }

    public void stop() {
        System.setOut(System.out);
    }

    public String getOutput() {
        return outputStream.toString().trim();
    }

    public void clear(){
        printStream.flush();
        outputStream.reset();
    }
}