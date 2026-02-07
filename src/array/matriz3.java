package array;

import java.util.Arrays;
import java.util.Scanner;

public class matriz3 {
    public static void main(String[] args) {
        int[][] nummbers = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8}
        };

        for (int i = 0; i < nummbers.length; i++) {
            int total = 0;
            for (int j = 0; j < 8; j++) {
                total += nummbers[i][j];
            }
            System.out.println("Suma de la fila " + (i+1) + ": " + total);

        }

    }
}
//
//  /\_/\
// ( x.o )