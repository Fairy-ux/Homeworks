package main.java;

import java.io.FileNotFoundException;

public interface BoardReader {
    char[][] readBoard() throws FileNotFoundException;
    String toString();
}
