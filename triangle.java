public class triangle {
    public static void main(String[] args) {
        int n=4,j=1,row=1;
        for (int i = 1; j <= n ; i++) {
            if (row%n==1 && row != 1) {
                System.out.println();
                j++;
                i=i-j;
            }
            else if (i>=j) {
                System.out.print("*");
              
            }
            else{
                System.out.print(" ");
            }
                row++;

        }
    }
}
