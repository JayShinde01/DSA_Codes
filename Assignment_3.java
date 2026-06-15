public class Assignment_3{
    public static void main(String[] args) {
        System.out.println("Assignment no - 3");
        spiralPattern(5);
    }
    /**
     * Q1. Double Number Pyramid
            For n = 4, 
            1
           12
           123
           1234
           123
           12
           1
     */
    public  static void doubleNumberPyramid(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("  "+j);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
    /**
     * Q2. Number Butterfly
        For n = 4,
        1      1
        12    21
        123  321
        12344321
        12344321
        123  321
        12    21
        1      1
     */
    public static void butterflyDigits(int n){
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            for(int j = 1 ; j <= n*2 - i * 2; j++ ){
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
        System.out.println();
        }
        for (int i = n; i >=  1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int j = 1 ; j <= n*2 - i*2; j++ ){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /**
     * Q3. Cross (X) Number Pattern
        For n = 5,
             1    1
              2  2
               3
             4  4
            5    5
     */
    public static void pattern_digit_X(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == j || i+j == n+1){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /**
     * Q4. Spiral Layer Pattern
            For n = 3,
            3 3 3 3 3
            3 2 2 2 3
            3 2 1 2 3
            3 2 2 2 3
            3 3 3 3 3

     */
    public static void spiralPattern(int n) {

    int size = 2 * n - 1;

    for (int i = 0; i < size; i++) {

        for (int j = 0; j < size; j++) {

            int minDistance = Math.min(
                    Math.min(i, j),
                    Math.min(size - 1 - i, size - 1 - j));

            System.out.print((n - minDistance) + " ");
        }

        System.out.println();
    }
}
}