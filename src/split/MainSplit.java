package split;

import java.util.Arrays;

public class MainSplit {
    public static void main(String[] args) {

        Split split = new Split();
        int [] a3 = {1,2,3,4,5,6,7,8,9,0};

        int [] a1 = {1 , 4 ,8,};
        int [] a2 = {2, 3,6,7};

        int [] result = split.mergedSorted(a1, a2);

        int[][] result2 = split.splitDesdeNumero(a3, 4);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.deepToString(result2));
    }
}
//
//  /\_/\
// ( x.o )