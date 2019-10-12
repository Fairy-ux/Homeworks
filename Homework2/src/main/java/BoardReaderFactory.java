package main.java;

public class BoardReaderFactory {
    public static BoardReader getReader(String format) {
        if (format.equalsIgnoreCase("sdk")) {
            return new SDKReader();
        }
        else if (format.equalsIgnoreCase("ss")) {
            return new SSReader();
        }
        throw new UnsupportedOperationException("Reader for format " + format
        + " is not supported");
    }
}
