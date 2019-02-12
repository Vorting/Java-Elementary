package com.homeWork;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutInpStr {

    public static void main(String[] args) {


        String matrix = "Welcome to matrix. Choose your pill...";

        System.out.println(matrix);

        final String filePath = "D:\\matrix.txt";

        int matrixData[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        FileOutputStream myMatrix = null;

        try {
            myMatrix = new FileOutputStream(filePath, true);

            for (int i = 0; i < matrixData.length; i++) {
                myMatrix.write(matrixData[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (myMatrix != null) {
                    myMatrix.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
