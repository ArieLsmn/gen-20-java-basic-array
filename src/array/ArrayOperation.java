package array;

public class ArrayOperation {

    public static int arraySum(int[] input){
        int sum = 0;

        for (int j : input) sum += j;

        return sum;
    }
    public static int[] arraySum2D(int[][] input){
        int[] sum = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                sum[i] += input[i][j];
            }
        }
        return sum;
    }
    public static int[] arrayReverse(int[] input)
    {
        int[] revArr = new int[input.length];
        int j = input.length;
        for (int i = 0; i < input.length; i++) {
            revArr[j - 1] = input[i];
            j--;
        }
        return revArr;
    }

}
