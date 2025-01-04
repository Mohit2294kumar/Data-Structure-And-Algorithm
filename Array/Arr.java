public class Arr{
    public static void main(String[] args){
        int n = 2;
        int m = 4;
        int a[][] = {{2,4,5,6},{35,9,3,69}};
        int b[][] = {{2,9,7,1},{93,03,49,4}};
        int c[][] = new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                c[i][j] = a[i][j]*b[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            System.out.print(c[i][j]+" "); 
            }
            System.out.println();   
        }
        System.out.println(); 
    }
}