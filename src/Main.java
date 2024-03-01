import array.ArrayOperation;
import textreadwrite.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        int[] arr = {3,4,5,1,2};
        int[][] arr2 = {{1,2,3},{3,4,5},{3,4,6}};
        System.out.println(ArrayOperation.arraySum(arr));
        int[] arr2dsum = ArrayOperation.arraySum2D(arr2);
        for (int x : arr2dsum) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();
        int[] arrReversed = ArrayOperation.arrayReverse(arr);
        for (int x : arrReversed) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();
        ReadText.readFile("test.txt");
        WriteText.writeFile("testfile.txt");

    }
}