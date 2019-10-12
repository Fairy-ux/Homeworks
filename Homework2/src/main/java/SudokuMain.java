package main.java;

import java.io.FileNotFoundException;

public class SudokuMain {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("SDK FORMAT");
        String filePathSDK = "src\\main\\resources\\board.sdkx";
        SDKReader sdk  = new SDKReader(filePathSDK);
        sdk.readBoard();
        System.out.println(sdk);

        System.out.println("SS FORMAT");
        String filePathSS = "src\\main\\resources\\board.ss";
        SSReader ss = new SSReader(filePathSS);
        ss.readBoard();
        System.out.println(ss);
    }
}
