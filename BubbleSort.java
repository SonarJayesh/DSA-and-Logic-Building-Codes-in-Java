public class BubbleSort {

    public static void sortedArray(int arr[]){

        System.out.println("Array After Sorting");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {70,60,50,20,30};

        System.out.println("Array Before Sorting: ");
        for(int i = 0; i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();    

        //time complexity = O(n^2)
        //bubble Sort
        for(int i = 0; i<arr.length-1;i++){ //n-1

            for(int j =0 ;j<arr.length-i-1;j++){

                if( arr[j]> arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        sortedArray(arr);
    }
}
