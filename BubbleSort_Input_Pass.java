import java.util.Scanner;

public class BubbleSort_Input_Pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input the Arra Element Size
        System.out.println("Enter the Size of an Array");
        int size =sc.nextInt();
        int[] arr = new int[size];

         //Input the Arra Elements
        System.out.println("Enter the Array Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //bubble Sort Operation
        for(int i =0;i<arr.length;i++){

            for(int j = 0;j<arr.length-i-1;j++){

                if(arr[j]> arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;

                }
            }

            //Print the Passes 
            System.out.println("\n \n After Pass "+i+"\n");

            for(int k=0;k<arr.length;k++){
                System.out.print("\t"+ arr[k]+" ");
            }
        }
    }
}
