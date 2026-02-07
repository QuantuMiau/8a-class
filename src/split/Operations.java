package split;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class Operations {
    public void splitArray  (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros del arreglo.");
        int arrayLeng = sc.nextInt();

        int [] arrayNumber = new int[arrayLeng];

        for (int e = 0; e < arrayNumber.length; e++) {
            System.out.println("Ingrese el numero: " + (e + 1));
            int tempNumber = sc.nextInt();
            arrayNumber[e] = tempNumber;
        }

        System.out.println("Ingresa el numero de partes en las que se dividira el arreglo");
        int parts = sc.nextInt();

        int actualIndex = 0;
        int arrayLength = arrayNumber.length / parts ;

        for (int e = 0; e < parts; e++) {
            int [] arrayTemp = Arrays.copyOfRange(arrayNumber, actualIndex, actualIndex + arrayLength);
            actualIndex += arrayLength;
            System.out.println(Arrays.toString(arrayTemp));
        }

        if (arrayLength % parts == 0) {
            int[] arrayTemp = Arrays.copyOfRange(arrayNumber, actualIndex, arrayNumber.length);
            System.out.println("Residuo por se un numero impar:");
            System.out.println(Arrays.toString(arrayTemp));
            System.out.println(arrayLength % parts);

        }

        System.out.println("-----------------------------------");
    }
    
    public void splitDesdeNumero (){

        Scanner sc = new Scanner(System.in);
        int index = 0;

        System.out.println("Ingrese la cantidad de numeros del arreglo.");
        int arrayLeng = sc.nextInt();

        System.out.println("Ingrese la posicion desde la que que desea dividir.");
        int numberToSplit = sc.nextInt();

        int [] arrayNumber = new int[arrayLeng];

        for (int e = 0; e < arrayNumber.length; e++) {
            System.out.println("Ingrese el numero: " + e);
            int tempNumber = sc.nextInt();
            arrayNumber[e] = tempNumber;
        }

        for (int i = 0; i < arrayNumber.length; i++) {
            if ( i == numberToSplit) {
                index = i;
                break;
            }
        }
  
        int [] izquierda = Arrays.copyOfRange(arrayNumber, 0, index );
        int [] derecha = Arrays.copyOfRange(arrayNumber, index, arrayNumber.length);

        System.out.println(Arrays.toString(izquierda));
        System.out.println(Arrays.toString(derecha));
        System.out.println("-----------------------------------");

    }

    public void mergedSorted (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros del primero arreglo.");
        int length1 = sc.nextInt();

        int[] a = new int[length1];

        for (int e = 0; e < a.length; e++) {
            System.out.println("Ingresa el numero:" + (e + 1));
            int temp = sc.nextInt();
            a[e] = temp;
        }

        System.out.println("Ingresa la cantidad de numeros del seguno arreglo.");
        int length2 = sc.nextInt();

        int[] b = new int[length2];

        for (int e = 0; e < b.length; e++) {
            System.out.println("Ingresa el numero:" + (e + 1));
            int temp = sc.nextInt();
            b[e] = temp;
        }

         int[] merged = new int[ a.length + b.length];

         System.arraycopy(a, 0, merged,0, a.length);
         System.arraycopy(b, 0, merged, a.length, b.length);

        // ordenaminto por seleccion
        for (int i = 0; i < merged.length - 1; i++) {
            int minimo = i;

            for (int j = i + 1; j < merged.length; j++) {
                if (merged[j] < merged[minimo]) {
                    minimo = j;
                }
            }

            int temp = merged[minimo];
            merged[minimo] = merged[i];
            merged[i] = temp;
        }
        System.out.println("Arreglo unido y ordenado de mayor a menor");
        System.out.println(Arrays.toString(merged));
        System.out.println("-----------------------------------");
    }
}
//
//  /\_/\
// ( x.o )