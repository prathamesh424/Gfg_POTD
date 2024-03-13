 public class digonalMat {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length  ;
        int ans[]= new int[n*n];
        int r = 0 , row = n ,  col = 0;
        // till diagonal ..
        for (int i = 0 ; i < row ;i++) {
            if (col % 2 == 0) { // horizontal
                int curr  = i ;
                for (int j = 0 ; j <= i ;j++){
                    ans[r++] = mat[curr][j] ;
                    curr--;
                }
            }
            else {
                int curr =0 ; // vertical
                for (int j = i ; j >= 0 ;j--) {
                    ans[r++] = mat[curr][j] ;
                    curr++;
                }
            }
            col++;
        }

        // Similar As Above only change range diagonal to end of matrix...
        // After ddiagonal
        for (int i = 1 ; i < row ;i++) {
            if (col % 2 == 0) {
                int curr= row-1 ;
                for (int j = i ; j < n ;j++){
                    ans[r++] = mat[curr][j];
                    curr--;
                }
                
            }
            else  {
                int curr  = i; 
                for (int j = n-1 ; j >= i ;j--) {
                    ans[r++]= mat[curr][j] ;
                    curr++;
                }
            }
            col++;
        }
        return ans ; 
}
    
}