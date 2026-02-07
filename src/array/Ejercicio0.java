package array;

import java.util.Arrays;

public class Ejercicio0 {
    public static void main(String[] args) {
        int [] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3]= 4;
        numeros[4] = 5;

        int[] calificaciones = {8,9,10,3,5,9};
        for (int e : calificaciones) {
            System.out.println(e);
        }

        Arrays.sort(calificaciones);
        System.out.println(Arrays.toString(calificaciones));
    }
}
//
//  /\_/\
// ( x.o )