import array.ArrayOperation;
import textreadwrite.*;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Panjang array 1 dimensi:");
        Scanner in = new Scanner(System.in);
        int p1 = in.nextInt();
        int[] arr1 = new int[p1];
        System.out.println("Isi array:");
        for (int i=0;i<p1;i++){
            arr1[i] = in.nextInt();
        }
        for (int isi : arr1
             ) {
            System.out.print(isi+" ");
        }
        System.out.println();
        //tugas array

        int[][] arr2 = {{1,2,3,4,5},{3,4,5},{3,4,5,1}};


        System.out.println("Total array 1 dimensi:");
        System.out.println(ArrayOperation.arraySum(arr1));
        System.out.println("Array 1 dimensi reverse:");
        int[] arrReversed = ArrayOperation.arrayReverse(arr1);
        for (int x : arrReversed) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Isi array 2 dimensi:");
        for (int[] x : arr2
        ) {
            System.out.print("{");
            for (int y : x
            ) {
                System.out.print(y+" ");

            }System.out.println("}");

        }

        System.out.println();
        System.out.println("Total array 2 dimensi:");
        int[] arr2dsum = ArrayOperation.arraySum2D(arr2);
        for (int x : arr2dsum) {
            System.out.print(x);
            System.out.print(";");
        }

        System.out.println();
        //Tugas read write file teks
        System.out.println("Isi teks yang di read:");
        ReadText.readFile("test.txt");

        System.out.println();
        System.out.println("Ketik teks yang akan di write ke file:");
        in.nextLine();
        String line = in.nextLine();
        WriteText.writeFile("testfile.txt",line);

        //System.out.println("Isi teks yang di write:");
        //ReadText.readFile("testfile.txt");

    }
}