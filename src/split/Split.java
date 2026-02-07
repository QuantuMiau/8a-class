package split;

import java.util.Arrays;

public class Split {
    public int[][] splitDesdeNumero (int [] a, int numberToSplit){
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if ( a[i] == numberToSplit) {
                index = i;
                break;
            }
        }
  
        int [] izquierda = Arrays.copyOfRange(a, 0, index );
        int [] derecha = Arrays.copyOfRange(a, index, a.length);

        return new int[][]  {izquierda , derecha};
    }

    public int [] mergedSorted (int [] a, int []b ){
         int[] merged = new int[ a.length + b.length];

         System.arraycopy(a, 0, merged,0, a.length);
         System.arraycopy(b, 0, merged, a.length, b.length);

        for (int i = 0; i < merged.length - 1; i++) {
            for (int e = 0; e < merged.length - 1 - i; e++) {
                if (merged[e] > merged[e + 1]) {
                    int temp = merged[e];
                    merged[e] = merged[e + 1];
                    merged[e + 1] = temp;
                }
            }
        }

        return merged;
    }
}
//
//  /\_/\
// ( x.o )