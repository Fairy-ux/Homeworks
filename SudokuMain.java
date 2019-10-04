import java.io.FileNotFoundException;

public class SudokuMain {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "sudoku.sdkx";
        SudokuBoard sudoku = new SudokuBoard(filePath);
        System.out.println(sudoku);
    }
}
