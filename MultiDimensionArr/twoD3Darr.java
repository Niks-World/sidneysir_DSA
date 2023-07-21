package MultiDimensionArr;

public class twoD3Darr{
public static void main(String[] args) {

  // print the 2 ,5 from given element 
  int [][] A = new int[][]{
    {12,8,5,7},
    {3,1,13,2},
    {5,2,9,4},
    {8,9,1,11} 
      

    };
     System.out.println(A[0][2]);   //5
     System.out.println(A[2][1]);   // 2
     System.out.println(A[3][3]);    //11
   //--------------------------------------------
    int [][] B = new int[][]{
    {12,8,5,7},
    {3,1,13,2},
    {5,2,9,4},
    };
      
    int m = B.length;       // #row 
    int n  = B[0].length;  // colums
  System.out.println("Rows: "+m+"; Cols: "+n);
    // it will give me thee op of rows 3 and colm 4

    // we can check the indexing of rows and colum 
    for(int i =0; i<m; i++){
      for(int j=0; j<n; j++){
        System.out.print("["+ i + "][" + j + "]");
      }
       System.out.println();
    }
    // it will op= all the indexing number 
    //---------------------------------------
  //Q Update the elment 
     int [][] C = new int[][]{
    {12,8,5,7},
    {3,1,13,2},
    {5,2,9,4},
    };
     
    for(int i =0; i<m; i++){
      for(int j=0; j<n; j++){
       System.out.print(C[i][j]); //to see old elm
      }
       System.out.println();
    }
      
    int k = C.length;       // #row 
    int l  = C[0].length;  // colums

    C[0][0] = 0;
    C[1][1] = 0;
    C[2][2] = 0;

    for(int i =0; i<k; i++){
      for(int j=0; j<l; j++){
        System.out.print(C[i][j] + " "); 
      }
       System.out.println();
    }
    /* this will be the print out 
     0 8 5 7 
     3 0 13 2 
     5 2 0 4 */

    //Q print the last row vertical 
    //5
    ///2
    //9
    //4
    
   for(int j=0; j<l; j++){
        System.out.println(C[k-1][j] + " ");
      }
    // out put will we in vertical 5 2 0 4
     
    //Q print array in `Snake` form
    
   // 12 8 5 7 2 13 1 3 5 2 9 4
    
    int[][] D = new int[][] {
    {12, 8, 5, 7},
    {3, 1, 13, 2},
    {5, 2, 9, 4},
};

    int g = D.length;       // #row 
    int h = D[0].length;    // columns

   for (int i = 0; i < g; i++) {
    if ((i % 2) == 0) {
        for (int j = 0; j < h; j++) {
            System.out.print(D[i][j] + " "); 
        }
        System.out.println();
    } else {
        for (int j = h - 1; j >= 0; j--) {
            System.out.print(D[i][j] + " "); 
        }
        System.out.println();
    }
}
// if i want to print in vertical then just commet out the [ System.out.println() ]  than it will be print in vortical way 
    

  }
}
    

