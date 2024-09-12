public class SelectionSort {

   
    public static void sortedArray(int arr[]){
        System.out.println(" \n Array After Sorting");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {

        int arr[] = {10,8,3,80,5};
        
        System.out.println("Array Before Sorting :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i =0;i<arr.length-1;i++){

            int smallest = i;

            for(int j =i+1 ;j<arr.length;j++){

                if (arr[smallest]>arr[j]) {
                    
                    smallest= j;
                }
            }

            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }

        sortedArray(arr);
    }
}
