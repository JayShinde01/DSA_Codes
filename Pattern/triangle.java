package Pattern;

import java.util.Scanner;

public class triangle {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pattern7(num);
    }
     public static void pattern10(int n){
        
        for(int i = 1; i <= n ;i++){
             
            for (int j = 1; j <= n; j++) {
               if (j==4 || i ==1 || j==1 || i ==4) {
                System.out.print("*");
            
               } else {
                System.out.print(" ");
            
               }
               
            } 
              
            System.out.println();
        }
      
    }
    public static void pattern9(int n){
        
        for(int i = 0; i < n ;i++){
             
            for (int j = 0; j <= i; j++) {
               System.out.print("*");
            } 
             for (int j = 1; j <= n*2-2*i; j++) {
               System.out.print(" ");
            } 
        for (int j = 0; j <= i; j++) {
               System.out.print("*");
            }
              
            System.out.println();
        }
          for(int i = 0; i < n ;i++){
             
            for (int j = 0; j <= n-i; j++) {
               System.out.print("*");
            } 
             for (int j = 1; j <= i*2; j++) {
               System.out.print(" ");
            } 
        for (int j = 0; j <= n-i; j++) {
               System.out.print("*");
            } 
              
            System.out.println();
        }
      
    }
     public static void pattern8(int n){
        
        for(int i = 0; i <= n ;i++){
             
            for (int j = 0; j <= n-i; j++) {
               System.out.print("*");
            } 
             for (int j = 1; j <= 2*i; j++) {
               System.out.print(" ");
            } 
         for (int j = 0; j <= n-i; j++) {
               System.out.print("*");
            } 
              
            System.out.println();
        }
          for(int i = 0; i <= n ;i++){
             
            for (int j = 0; j <= i; j++) {
               System.out.print("*");
            } 
             for (int j = 1; j <= n*2-i*2; j++) {
               System.out.print(" ");
            } 
         for (int j = 0; j <= i; j++) {
               System.out.print("*");
            } 
              
            System.out.println();
        }
      
    }
     public static void pattern7(int n){
        
        for(int i = 1; i <= n ;i++){
             int c = 'A'+ n-i;
             char ch = (char)c;
            for (int j = 1; j <= i; j++) {
               
               System.out.print(ch);
             ch++;
            } 
              
            System.out.println();
        }
      
    }
 public static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        char ch = 'A';

        // Print characters
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print(ch);

            if (j < i) {
                ch++;
            } else {
                ch--;
            }
        }

        System.out.println();
    }
}

       public static void pattern5(int n){
         char ch = 'A';
        for(int i = 1; i <= n ;i++){
            
            for (int j = 1; j <= i; j++) {
               
               System.out.print(ch);
             
            } 
              ch++;
            System.out.println();
        }
      
    }
      public static void pattern4(int n){
        for(int i = 1; i <= n ;i++){
             char ch = 'A';
            for (int j = 1; j <= i; j++) {
               
               System.out.print(ch);
               ch++;
            } 
            
            System.out.println();
        }
      
    }
      public static void pattern3(int n){
        for(int i = 1; i <= n ;i++){
            for (int j = 1; j <= i; j++) {
               System.out.print(j);
            } 
            for (int j = 1; j <= 2*n-2*i; j++) {
               System.out.print(" ");
            } 
            for (int j = i; j >= 1; j--) {
               System.out.print(j);
            }         
            System.out.println();
        }
      
    }
    public static void pattern2(int n){
        for(int i = 0; i < n ;i++){
            for (int j = 0; j < i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }         
            System.out.println();
        }
      
    }
    public static void pattern(int n){
        for(int i = 0; i <= n ;i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
             for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
               for (int j = 0 ;j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = n; i > 0 ;i--){
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
             for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
               for (int j = 0 ;j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
