import java.util.Scanner;

public class SelectionSort_Input_Pass {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input the Array Size
        System.out.println("Enter the Size of an Array: "); 
        int size=sc.nextInt();

        int[] arr = new int[size];

        //input the Array Elements
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Selection Sort Operation
        for(int i=0; i<arr.length-1;i++){
            int smallest = i;

            for(int j=i+1;j<arr.length;j++){
                
                if (arr[smallest]> arr[j]) {
                    
                    smallest = j;
                }
            }
            
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            //print the Passes
            System.out.println("\n \n Pass: "+ i + "\n");

            //print the Sorted Array
            for(int j=0;j<arr.length;j++){
                System.out.print("\t"+ arr[j]);
            }
        }
    }
}
