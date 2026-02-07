package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de numeros que usaras");
        int numQty = sc.nextInt();

        int[] calificaciones = new int[numQty];

        for (int e = 0; e < calificaciones.length; e++) {
            System.out.println("Ingresa la calificacion " + (e + 1));
            int calf = sc.nextInt();
            calificaciones[e] = calf;
        }

        int total = 0;
        for (int i = 0; i < calificaciones.length ; i++) {
            total += calificaciones[i];
        }

        float media = total / numQty;

        Arrays.sort(calificaciones);

        double mediana;
        int n = calificaciones.length;

        if (n % 2 == 0) {
            mediana = (calificaciones[n/2 - 1] + calificaciones[n/2]) / 2.0;
        } else {
            mediana = calificaciones[n/2];
        }

        // modda
        int moda = calificaciones[0];
        int frencuenciaMax = 0;

        for (int e = 0; e < calificaciones.length; e++) {
            int contador = 0;

            for (int j = 0; j < calificaciones.length; j++) {
                if (calificaciones[e] == calificaciones[j]) {
                    contador++;
                }
            }

            if (contador > frencuenciaMax) {
                frencuenciaMax = contador;
                moda = calificaciones[e];
            }
        }

        System.out.println("total " + total);
        System.out.println("media:"+media);
        System.out.println("mediana " + mediana);
        System.out.println("moda " + moda);


    }
}
//
//  /\_/\
// ( x.o )