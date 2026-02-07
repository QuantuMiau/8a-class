package array;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nummbers = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor" + i +"," + j);
                nummbers[i][j] = sc.nextInt();
            }
        }

        int total = 0;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                total   = total + nummbers[i][j];
            }
        }

        System.out.println(Arrays.deepToString(nummbers));
        System.out.println(total);
        System.out.println(total/6);

    }
}
//
//  /\_/\
// ( x.o )