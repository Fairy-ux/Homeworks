import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String filePath) throws FileNotFoundException {
        board = new char[9][9];

        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNextLine()) {
            for (int i = 0; i < 9; i++) {
                String lineRead = scanner.nextLine();
                for (int j = 0; j < 9; j++) {
                    if (Character.isDigit(lineRead.charAt(j)) || lineRead.charAt(j) == 'x') {
                        board[i][j] = lineRead.charAt(j);
                    }
                    else {
                        System.out.println("FORMAT INVALID!");
                    }
                }
            }
        }
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
