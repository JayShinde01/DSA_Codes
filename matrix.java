public class matrix {
    public static void main(String[] args) {
        int mat [][]={{1,1,1},{1,0,1},{1,1,1}};
        if_zero_found2(mat);
    }

public static void if_zero_found3(int mat [][]) {
    int col=1;

    for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    mat[i] [0]=0;
                    if(j==0){
                        col=0;
                    }
                    else{
                    mat[0] [j]=0;

                    }
                    
                    
                }
            }
        }
        if (mat[0][0]==0) {
            for (int i = 0; i < mat.length; i++) {
                mat[0][i]=0;
            }
        }
        if (col==0) {
            for (int i = 0; i < mat.length; i++) {
                mat[i][0]=0;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                
            System.out.print( mat[i][j]);

            }
            System.out.println();
        }
        
 }

 public static void if_zero_found2(int mat [][]) {
    int row[]=new int[mat.length];
    int col[]=new int[mat[0].length];

    for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    
                    row[i] =1;
                    col[j] =1;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (col[j]==1 || row[i]==1) {
                    mat[i][j]=0;
                }
            System.out.print( mat[i][j]);

            }
            System.out.println();
        }
        
 }


    public static void if_zero_found(int mat [][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    for(int k =0;k<mat.length;k++){
                    mat[i][k] =-1;
                    mat[k][j] =-1;

                    }
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == -1) {
                   
                    mat[i][j] =0;

                    
            }
            System.out.print( mat[i][j]);

        }
        System.err.println();
    }
}}
