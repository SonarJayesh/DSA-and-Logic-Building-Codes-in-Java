public class Recurtion_CheckisArrayisSortedOrNot {

    public static boolean isSorted(int arr[], int index){
        if (index == arr.length-1) {
            return true;
        }

        if (arr[index] >= arr[index+1]) {
            //array is unsorted 
            return false;
        }
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,8,3,4};
        System.out.println(isSorted(arr, 0));
    }
}
