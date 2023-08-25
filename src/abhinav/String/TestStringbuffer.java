package abhinav.String;

public class TestStringbuffer {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("ravi");
        System.out.println(str.capacity());
        str.append("kumar").append("chopra");
        System.out.println(str);

        StringBuilder str4= new StringBuilder("Abhinav");
        str4.append("singh");
        System.out.println(str4);


        // split();
        String names ="1111.456.1111.3333";
        String arr[] =names.split("\\.");

      //  System.out.println(arr[1]);

        for(String v:arr){
            System.out.println(v);
        }

       // System.out.println(arr);
//substring

        String v = "123145.3456";
        int index =v.indexOf(".");
         String whl =v.substring(0,index);
         String decimal = v.substring(index+1);

        System.out.println(whl);
        System.out.println(decimal);




        String vb ="Abc";     ///   65*961 +98 *31  + 99*1
        System.out.println(vb.hashCode());

        String data="dgsddsgsdgdsg raju gsdgsgsgd rskesh ddsgdsgdsgsdgs ? dgsgsdgsdg ? dgsdgsdgsdgsdg? gdsgsdgdsgdsgsd";
        System.out.println(data.replaceAll("\\?"," "));

        String answer ="odisha ,born in this state is a thing of fortune";

        System.out.println(answer.startsWith("odisha"));
        if(answer.contains("bihar")){

            System.out.println("answer accept");
        }

        String x= "Abhinavkumarsing";

        char []caa =x.toCharArray();



        int count =0;
         for(char c: caa){
             if(c=='A'|| c=='a'){

                 count++;
             }

         }
        System.out.println(count);
        System.out.println(x.charAt(1));

        System.out.println("b".compareTo("b"));


        String s="ibihar";
        String y="xyzbihAr";

        System.out.println(s.regionMatches(true,1,y,3,4));

        String odisha="rosgulla sweet";
        String bengol="my sweet Rosgulla";

        System.out.println(odisha.regionMatches(true,0,bengol,9,7));

    }

}
