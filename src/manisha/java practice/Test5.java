public class Test5 {

    public static void main(String[] args) {


            
            int A[][]={{1,2,3},{4,5,6}};

            int B[][]={{7,8},{9,10},{11,12}};


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

            System.out.println("C === A*B >");


            int rowsA=A.length;
            int colsA=A[0].length;
            int colsB=B[0].length;


            int c[][]= new int[rowsA][colsB];



            for(int i =0;i<rowsA;i++){


                for (int j=0;j<colsB;j++){


                    for(int k=0;k<colsA;k++){

                        System.out.println("i="+i+"\tj="+j+"\tk="+k);
                        c[i][j]=c[i][j]+A[i][k]*B[k][j];


                    }



                }



            }




        for(int i=0;i<c.length;i++){

            for(int j=0;j<c[i].length;j++){

                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }





        
    }
}
