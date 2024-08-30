public class InsertionSort {

    public static void sortedArray(int arr[]){

        System.out.println("Array After Insetion Sort");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,2};

        System.out.println("Unsorted Array Elements :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for(int i=0; i<arr.length;i++){
            int current = arr[i];

            int j = i-1;
            while (j >= 0 && current< arr[j]) {
                arr[j+1]= arr[j];
                j--;
            }

            arr[j+1] = current;
        }
        sortedArray(arr);
    }
}
