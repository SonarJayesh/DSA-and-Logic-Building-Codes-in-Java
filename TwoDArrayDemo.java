import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the No of Rows: ");
        int Rows = sc.nextInt();
        System.out.println("Enter the No of Column: ");
        int column =sc.nextInt();

        int[][] arr = new int[Rows][column];

        System.out.println("Enter the Elenent of rows and Columns");

        for(int i =0;i<Rows;i++){

            for(int j =0;j<column;j++){

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("array Element is: ");
        for(int i =0;i<Rows;i++){

            for(int j =0;j<column;j++){

                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
