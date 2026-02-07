package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cat {
    public static void main(String[] args) {
        char[][] catGame = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        int actualPlayer = 1;
        Scanner sc = new Scanner(System.in);

        int turn = 0;

        do {
            int file;
            int column;


            for (int i = 0; i < 3; i++) {
                System.out.println(" " + catGame[i][0] + " | " + catGame[i][1] + " | " + catGame[i][2]);
                if (i < 2) {
                    System.out.println("---+---+---");
                }
            }

            System.out.println("Jugador: " + actualPlayer);
            System.out.println("Ingrese la columna 0-2");
            column = sc.nextInt();
            System.out.println("Ingresa la fila 0-2");
            file = sc.nextInt();

            if (catGame[file][column] == ' ') {
                if (actualPlayer == 1 ) {
                    catGame[file][column] = 'x';
                    actualPlayer = 2;
                    turn ++;
                }else {
                    catGame[file][column] = 'o';
                    actualPlayer = 1;
                    turn++;
                }
            } else {
                System.out.println("casilla ya utilizada");
            }

            System.out.println();
        } while (turn <= 9);

        System.out.println("juego trminado");

    }


}
//
//  /\_/\
// ( x.o )