public class Assignment_2{
    public static void main(String[] args) {
        System.out.println("Assignment no - 2");
        Chessboard(4);
    }
    /*
        Q1) Hollow Square
        Print a hollow square of size n.
        Example
        If n = 5
        *  *  *  *  *
        *           *
        *           *
        *           *
        *  *  *  *  *
    */
   public static void hollowRect(int n) {
       for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= n ; j++){
            if(i == 1 || j == 1 || i == n || j == n){
                System.out.print(" *");
            }
            else{
                System.err.print("  ");
            }
        }
        System.out.println();
       }
   }
   /*
        Q2) Diagonal Square (X Pattern)
        Print the following pattern:
        If n = 5
        *              *
            *       *
                *
            *       *
        *               *

    */
   public static void starPattern(int n){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if(i == j || i+j+1 == n){
                System.err.print("*");
            }
            else{
                System.err.print(" ");
            }
            
        }
        System.err.println();
    }
   }
   /*
        Q3) Right Triangle (Derived from Square)
            If n = 5
            *
            *  *
            *  *  *
            *  *  *  *
            *  *  *  *  *
   */
  public static void patternTriangle(int n){
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j <= i ; j++){
            System.err.print(" *");
        }
        System.err.println();
    }
  }
  /**
     Q4) Inverted Right Triangle
        If n = 5
        *  *  *  *  *
        *  *  *  *
        *  *  *
        *  *
        *
*/
    public static void patternTriangle1(int n){
        for(int i = n ; i  >= 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" *");
            }
            System.err.println();
        }
    }
    /**
        Q5) Chessboard Pattern
        If n = 4
        *  #  *  #
        #  *  #  *
        *  #  *  #
        #  *  #  *
     */
    public static void Chessboard(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" #");
                }
                
            }
            System.err.println();
        }
    }
}