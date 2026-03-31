import java.util.ArrayList;
import java.util.List;

public class matrix {
    public static void main(String[] args) {
        int mat [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(mat));
    }
    //
    public static List<Integer> spiralOrder(int[][] mat) {
        ArrayList <Integer> al = new ArrayList<>();
        int sr=0,sc=0;
        int ec=mat[0].length-1, er=mat.length-1;
        int dir=-1;
       int tle=mat.length*mat.length;
        while(tle != 0){
            dir=(dir+1)%4;
            if(dir==0){
                for(int i = sc;i<=ec;i++){
                    al.add(mat[sr][i]);
                    tle--;
                }
                sr++;
            }
            else if(dir==1){
                for(int i = sr;i<=er;i++){
                    al.add(mat[i][ec]);
                    tle--;
                }
                ec--;
            }
            else if(dir==2){
                for(int i =ec ;i>=sc;i--){
                    al.add(mat[er][i]);
                    tle--;
                }
                er--;
            }
             else {
                for(int i = er;i>=sr;i--){
                    al.add(mat[i][sr]);
                    tle--;
                }
            }
        }
        return al;
    }

//printing matrix
public static void printMatrixInDiffe(int mat[][]){
    int sr=mat.length-1,er=0;
    int sc=mat[0].length-1,ec=0;
    int tle=mat.length *mat[0].length;
    int dir=-1;
    while (tle != 0) {
        dir = (dir+1)%4;
        if(dir == 0){
            for(int i =sc;i>=ec;i--){
                System.out.print(" "+mat[sr][i]);
                tle--;
            }
            sr--;
        }
        else if(dir ==1){
            for (int i = sr; i >= er; i--) {
                System.out.print(" "+mat[i][ec]);
                tle--;

            }
            ec++;
        }
        else if(dir == 2){
            for(int i=ec;i<=sc;i++){
                System.out.print(" "+mat[er][i]);
                tle--;

            }
            er++;
        }
        else{
            for (int i = er; i <= sr; i++) {
                System.out.print(" "+mat[i][sc]);
                tle--;

            }
            sc--;
        }
    }
}

//same same but difeerent direction to print the matrix 
public static void prrintCircular(int mat [][]){
    int sr=0,ec=0;
    int sc=mat[0].length-1,er=mat.length-1;
    int tle = mat[0].length*mat[0].length;
    int dir =-1;
    while (tle != 0) {
        dir = (dir+1)%4;
        if(dir == 0){
            for(int i = sc;i >= ec;i--){
                System.out.print(" "+mat[sr][i]);
            }
            sr++;
        }
        else if(dir == 1){
            for(int i = sr;i <= er;i++){
                System.out.print(" "+mat[i][ec]);
            }
            ec++;
        }
          else if(dir == 2){
            for(int i = ec;i <=sc ;i++){
                System.out.print(" "+mat[er][i]);
            }
            er--;
        }
          else {
            for(int i = er;i >= sr;i--){
                System.out.print(" "+mat[i][sc]);
            }
            sc--;
        }
    }

}

//print circluar matrix
public static void printCircularMatrix(int mat [][]){
    int sr = 0;
    int sc = 0;
    int er = mat[1].length-1;
    int ec = mat.length-1;
    int tle = mat.length * mat[0].length;
    int dir = -1;
    while (tle != 0) {
         dir = (dir+1)%4;
         if (dir == 0) {
            for (int i = sr; i <= ec; i++) {
                System.out.print(" "+mat[sr][i]); 
                tle--;
            }
            sr++;
         }
         else if (dir == 1){
            for (int i = sr; i <= er; i++) {
                System.out.print(" "+mat[i][ec]);
                tle--;
            }
            ec--;
         }
         else if(dir == 2){
            for(int i=ec;i>=sc;i--){
                System.out.print(" "+mat[er][i]);
                tle--;
            }
            er--;
         }
         else{
            for (int i = er; i >= sr; i--) {
                System.out.print(" "+mat[i][sc]);
                tle--;
            }
            sc++;
         }
    }
}

//print 90 clockwise matrix
public static void clockwiseMatrix(int mat [][]){
    for (int i = 0; i < mat.length; i++) {
        for (int j = mat.length-1; j >=0 ; j--) {
            System.out.print(" "+mat[j][i]);
        }
        System.out.println();
    }
}


// print adjoint matrix 
public static void printAdjecentMatrix(int mat [][]){
    for (int i = 0; i< mat.length; i++) {
        for (int j = i+1; j < mat.length ; j++) {
            int temp = mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
        printMatrix(mat);
        System.out.println();
    }
}

// print matrix
public static void printMatrix(int mat [][]){
    for (int i = 0; i<mat.length; i++) {
        for (int j = 0; j < mat.length ; j++) {
            System.out.print(" "+mat[i][j]);
        }
        System.out.println();
    }
}
// print upper matrix only
public static void printUpperMatrix(int mat [][]){
    for (int i = 0; i< mat.length; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        for (int j = i; j < mat.length ; j++) {
            System.out.print(" "+mat[i][j]);
        }
        
        System.out.println();
    }
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
