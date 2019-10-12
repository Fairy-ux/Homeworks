package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SSReader implements BoardReader {
    private char[][] board;
    private File file;
    private char[][]outBoard;

    public SSReader(String filePath) {
        this.file = new File(filePath);
    }

    public  char[][] readBoard() throws FileNotFoundException {
        board = new char[9][9];

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            for (int i = 0; i < 9; i++) {
                String lineRead = scanner.nextLine();
                if (lineRead.charAt(i) == '-') {
                    lineRead = scanner.nextLine();
                }
                String lineReadNoPipe = lineRead.replace('|', ' ');
                String lineReadNoSpace = lineReadNoPipe.replaceAll(" ", "");
                for (int j = 0; j < 9; j++) {
                    if (Character.isDigit(lineReadNoSpace.charAt(j))) {
                       board[i][j] = lineReadNoSpace.charAt(j);
                    }
                    else if (lineReadNoSpace.charAt(j) == '.') {
                        board[i][j] = 'x';
                    }
                }
            }
        }
        return board;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if ((i) % 3 == 0) {
                result.append("-----------------------\n");
            }
            for (int j = 0; j < 9; j++) {
                result.append(board[i][j]).append(" ");
                if ((j + 1) % 3 == 0) {
                    result.append("| ");
                }
            }
            result.append("\n");
        }
        result.append("-----------------------");
        return result.toString();
    }
}
