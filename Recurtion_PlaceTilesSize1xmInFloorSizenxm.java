public class Recurtion_PlaceTilesSize1xmInFloorSizenxm {
    public static int placeTiles(int n, int m){

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        //vertically
        int vertPlacements = placeTiles(-m, m);

        //horzontally
        int horPlacetiles = placeTiles(n-1, m);

        return vertPlacements + horPlacetiles;    
    }
    public static void main(String[] args) {
        int n = 4 , m = 2;
        System.out.println(placeTiles(n, m));
    }
}
