

import java.util.Scanner;

public class Patterns {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pattern14(num);
       
    }


    public static void pattern14(int row){
        
        for(int i=0; i < row;i++){

            for(int j=1 ;j<=row-i;j++){
                System.out.print("   ");
            }
            for(int j=i+i ;j>=i;j--){
              
               if(i*i % 3 == 0 ){
                System.out.print("  *");
               }
               else{
                System.out.print(" "+j*10);
               }
                    
                
            }
        System.out.println();
        
        }
    }
       

    public static void pattern13(int row){
      int u = 10;
      int l = 0;
      int index=3;

       for(int i=1; i<=row/2+1;i++){
           
          u--;l++; 
            for(int j=1;j<=row;j++){

               if(j==l || j==u){

                    if(i%2 != 0 ){
                        System.out.print(index);
                    }
                    else{
                        System.out.print("*");
                    }

               }


               else{
                System.out.print(" ");
               }
            }
            if(i%2==0)index--;
            System.out.println();
        }
        for(int i=1; i<=5;i++){
          u++;l--;  
          if(i%2==0)
            index++;
            for(int j=1;j<=row;j++){
               if(j==l || j==u){
                if(i%2!=0 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(index);
                }
               }
               else{
                System.out.print(" ");
               }
            }
          
            System.out.println();
        }
        
       
       
    } 




    public static void pattern12(int row){
      int u = 4;
      int l = 6;
      int index=1;
        for(int i=1; i<=5;i++){
          u++;l--;
            for(int j=1;j<=row;j++){
               if(j==l || j==u){
                if(i%2!=0 ){
                    System.out.print(index);
                }
                else{
                    System.out.print("*");
                }
               }
               else{
                System.out.print(" ");
               }
            }
            if(i%2==0)
            index++;
            System.out.println();
        }
        
        for(int i=1; i<=4;i++){
           
          u--;l++; if(i%2==0)index--;
            for(int j=row;j>=1;j--){
               if(j==l || j==u){
                if(i%2!=0 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(index);
                }
               }
               else{
                System.out.print(" ");
               }
            }
            
            System.out.println();
        }
       
    } 




    public static void pattern11(int row){
        
        for( int i=1;i <= row ; i++){

            for(int s=1;s<=row-i;s++){
                System.out.print("    ");
            }
            if(i%2 != 0){
                for(int j=i*2-1;j>=i;j--){
                    System.out.print(" "+j*100);
            }}
            else{
                for(int j=1;j<=i;j++){
                    System.out.print("   *");
                }
            }
            System.out.println();
        }
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
