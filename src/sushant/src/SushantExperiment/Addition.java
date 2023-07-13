package SushantExperiment;


	import java.sql.SQLOutput;
	import java.util.Locale;
	import java.util.Scanner;

	public class Addition {

	    public static void main(String[] args) {
	         //addition of matrix
	        int A[][]={{1,2,3},{2,2,2},{3,3,3}};

	         int B[][]={{4,4,4},{1,1,1},{7,7,7}};


	        System.out.println("A ===  >");

	         for(int i=0;i<A.length;i++){

	             for(int j=0;j<A[i].length;j++){

	                 System.out.print(A[i][j]+"\t");
	             }
	             System.out.println();
	         }
	        System.out.println("B ===  >");
	        for(int i=0;i<B.length;i++){

	            for(int j=0;j<B[i].length;j++){

	                System.out.print(B[i][j]+"\t");
	            }
	            System.out.println();
	        }
         //Addition

	        if(A.length!=B.length || A[0].length!=B[0].length){

	            System.out.println("we cant perform addition of matrix if dimmensions are not equal ");

	            return;
	        }
          System.out.println("C === A+B >");

	        int [][]C=new int[A.length][A[0].length];
	             for(int i=0;i<C.length;i++){

	                 for(int j=0;j<C[0].length;j++){

	                     C[i][j]=A[i][j]- B[i][j];
	                 }
	             }
            System.out.println("C=");
	        for(int i=0;i<C.length;i++){

	            for(int j=0;j<C[0].length;j++){

	                System.out.print(C[i][j]+"\t");

	            }
	            System.out.println();
	        }}}

	          



