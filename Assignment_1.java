public class Assignment_1{
    public static void main(String[] args) {
        System.out.println("Assignment no - 1");

        pattern(4);
    }
    /*
        Q1) Print an n × n Star Square
        Take a dynamic input from the user and print an n × n square.
        Example:
        If n = 4
        *  *  *  *
        *  *  *  *
        *  *  *  *
        *  *  *  *
     */
    public static void squareStar(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void squareStar1(int n){
        for(int i = 1 ; i <= n*n ; i++){
            if(i % n == 0){
                System.out.println(" *");
            }
            else
                System.out.print(" *");
        }
    }
    /*
        Q2) Print the Following Pattern
        For n = 4
        1  1  1  1
        2  2  2  2
        3  3  3  3
        4  4  4  4
    */
   public static void digitpattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(" "+i);
            }
           System.out.println();
        }
   }
    public static void digitpattern1(int n){
        int count = 1 ;
        for(int i = 1 ; i <= n*n ; i++){
            if(i % n == 0)
                System.out.println(" "+count++);
            else
                System.out.print(" "+count);
        }
   }
   /*
    Q3) Print the Following Pattern
        For n = 4
        1  2  3  4
        1  2  3  4
        1  2  3  4
        1  2  3  4
   */
    public static void pattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}