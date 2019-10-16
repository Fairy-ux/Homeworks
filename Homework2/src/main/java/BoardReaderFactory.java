package main.java;

public class BoardReaderFactory {
    public static BoardReader getReader(String format) {
        if (format.equalsIgnoreCase("sdk")) {
            return new SDKReader("src/main/resources/board.sdkx");
        }
        else if (format.equalsIgnoreCase("ss")) {
            return new SSReader("src/main/resources/board.ss");
        }
        throw new UnsupportedOperationException("Reader for format " + format
        + " is not supported");
    }
}
