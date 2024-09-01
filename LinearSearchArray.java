import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Array Element: ");
        for(int i =0;i<arr.length;i++){
             
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the finding Value");
        int n = sc.nextInt();

        for(int i =0;i<arr.length;i++){
            if(n == arr[i]){
                
                System.out.println(n+ " is find with indexed: "+i);
            }
        }
    }
}
