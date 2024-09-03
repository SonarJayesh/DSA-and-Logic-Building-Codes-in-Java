public class Recurtion_CountTotalPath {
    
    public static int countPath(int i, int j, int n, int m){

        if (i==n || j==m) {
            return 0;
        }
        if (i == n-1 || j == n-1) {
            return 1;
        }
        //Move Downwards
        int downPaths = countPath(i+1, j, n, m);

        //Move right
        int rightPath = countPath(i, j+1, n, m);

        return downPaths + rightPath;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3; 

        int totalPaths = countPath(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
