import java.util.Scanner;

public class InsertionSort_Input_Pass {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size  = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<arr.length;i++){
             arr[i] = scanner.nextInt();
        }

        for(int i=0; i<arr.length;i++){
            int current = arr[i];

            int j = i-1;
            while (j >= 0 && current < arr[j]) {

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

            System.out.println("\n \n Pass: "+ i + "\n");

            for(int k =0; k<arr.length;k++){
                
                System.out.print("\t"+ arr[k]);
            }
        }
    }
}