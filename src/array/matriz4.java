package array;

import java.util.Scanner;

public class matriz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nummbers = new int[3][5];

        for (int i = 0; i < nummbers.length; i++) {
            for (int j = 0; j < nummbers[2].length; j++) {
                System.out.print("Ingrese el valor" + i +"," + j);
                nummbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < nummbers.length; i++) {
            for (int j = 0; j < nummbers[2].length; j++) {
                System.out.print(nummbers[i][j] + "|");
            }
            System.out.println();
        }


    }
}
//
//  /\_/\
// ( x.o )