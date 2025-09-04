package dsa;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr1= {10, 20, 30, 40, 50};
        int target1 = 40;

        System.out.println(linearSearch(arr1, target1));
    }

    // search in the array, return index if item found
    // if item not found, return -1

    static int linearSearch(int[] arr, int target){
        for ( int i = 0; i < arr.length; i++){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
