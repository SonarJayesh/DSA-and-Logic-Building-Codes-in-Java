import java.util.Scanner;

public class ArrayDemo {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the Size of an Array:");
            int size = scanner.nextInt();
            int arr[] = new int[size];
            
            System.out.println("Enter the Array Elements:");
            for(int i =0; i<size; i++){

                 arr[i] =scanner.nextInt();
            }

            System.out.println("Array Element is:");

            for(int i=0; i<size; i++){

                System.out.println(arr[i]);
            }
      }
}