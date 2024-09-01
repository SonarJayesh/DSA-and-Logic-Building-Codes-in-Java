import java.util.Scanner;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of Rows: ");
        int Rows = sc.nextInt();
        System.out.println("Enter the No of Column: ");
        int column =sc.nextInt();

        int[][] arr = new int[Rows][column];

        System.out.println("Enter the Elenent of rows and Columns");

        for(int i=0;i<Rows;i++){

            for(int j=0;j<column;j++){
             
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the Finding value of 2D array:");
        int n=sc.nextInt();
        for(int i = 0;i<Rows;i++){

            for(int j=0;j<column;j++){

                if(n==arr[i][j]){
                    System.out.println(n+" is find with location: "+i+" "+j);
                }
            }
        }
    }
}
