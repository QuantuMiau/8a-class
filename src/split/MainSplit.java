package split;

import java.util.Arrays;
import java.util.Scanner;

public class MainSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations arrays = new Operations();
        int selectionMenu;

        do {
            System.out.println("""
                    Seleccione una de las siguientes opciones.
                    1. Dividir un arreglo en partes.
                    2. Dividir un arreglo cuando aparezca un valor
                    3. Unir dos arreglos y ordenarlos.
                    4. Salir.""");
            selectionMenu = sc.nextInt();

            switch (selectionMenu) {
                case 1:
                    arrays.splitArray();
                    break;
                case 2:
                    arrays.splitDesdeNumero();
                    break;
                case 3:
                    arrays.mergedSorted();
                    break;
                case 4:
                    System.out.println("Adiooooos!!!! w ");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida....");
                    break;
            }
        } while (selectionMenu != 4);

    }
}
//
//  /\_/\
// ( x.o )