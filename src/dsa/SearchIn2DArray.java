package dsa;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        int[] ans = search(arr, target);
        // single digit output -> Arrays.toString(ans)
        // multiple arrays output -> Arrays.deepToString(ans)
        System.out.println(Arrays.toString(ans));

        System.out.println(Arrays.toString(max(arr)));
    }

    static int[] search(int[][]arr, int target){
        for( int row = 0; row < arr.length; row++)
            for( int col = 0; col < arr[row].length; col++)
                if( arr[row][col] == target){
                    return new int[]{row, col};
                }
        return new int[]{-1, -1};
    }

    //max number in array
    static int[] max(int[][]arr){
        int max = arr[0][0];
        for( int row = 0; row < arr.length; row++)
            for( int col = 0; col < arr[row].length; col++)
                if( arr[row][col] > max){
                    max = arr[row][col];
                }
        return new int[]{max};
    }
}
