public class Matrix {
    public static void main(String args[]){
        int A[][]={{2,2},{3,5}};
        int B[][]={{5,2},{4,6}};
        System.out.println("A ==>");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("B ==>");
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[i].length;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        if(A.length!=B.length || A[0].length!=B[0].length){
            System.out.println("addition of matrix cant be performed if the dimensions are not equal");
            return;
        }
        System.out.println("C == A+B");
        int C[][]=new int[A.length][A[0].length];
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++){
                C[i][j]=A[i][j] + B[i][j];
            }
            System.out.println();
        }
        System.out.println("C=");
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }    
    }
}
