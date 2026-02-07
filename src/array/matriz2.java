package array;

import java.util.Arrays;
import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nummbers = new int[3][3];

        for (int i = 0; i < nummbers.length; i++) {
            for (int j = 0; j < nummbers[2].length; j++) {
                System.out.print("Ingrese el valor" + i +"," + j);
                nummbers[i][j] = sc.nextInt();
            }
        }

        int parNumber = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double result = nummbers[i][j] % 2;
                if ( result == 0) {
                    parNumber++;
                }
            }
        }

        System.out.println(Arrays.deepToString(nummbers));
        System.out.println("Cantidad de numeros pares: " + parNumber);

    }
}
//
//  /\_/\
// ( x.o )