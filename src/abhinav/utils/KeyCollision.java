package abhinav.utils;

import java.sql.SQLOutput;
import java.util.*;

public class KeyCollision {


        public static void main(String[] args) {

            LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();


            hashMap.put("cat", 1);
            hashMap.put("dog", 2);
            hashMap.put("rat", 3);


            hashMap.put("art", 4);
            hashMap.put("tar", 5);


            System.out.println("Value for 'cat': " + hashMap.get("cat"));
            System.out.println("Value for 'dog': " + hashMap.get("dog"));


            hashMap.put("act", 6);
            System.out.println("Value for 'cat': " + hashMap.get("act"));
            System.out.println("Value for 'dog': " + hashMap.get("dog"));


            hashMap.put("abc",11);
            hashMap.put("def",45);

            hashMap.put("hello",999);
            hashMap.put("ehlol",888);





            System.out.println(getBucketNumber(hashMap,"hello"));
            System.out.println(getBucketNumber(hashMap,"ehlol"));


            Set<String> hs =  hashMap.keySet();

            Iterator<String> it = hs.iterator();


            while(it.hasNext()){
                String key=  it.next();

                System.out.print(key +"\t");

                System.out.println(hashMap.get(key));

            }



            hashMap.forEach((k,v)->{

                System.out.println(k+" for each "+v);
            });



            for(Map.Entry<String,Integer> entry : hashMap.entrySet()){

                System.out.println(entry.getKey() +" "+entry.getValue() );

            }



        }






    public static int getBucketNumber(HashMap<String, Integer> hashMap, String key) {
        int hashCode = key.hashCode();  // Get the hash code for the key
        int numBuckets = hashMap.size();  // Get the number of buckets (size of the HashMap)

        // Calculate the bucket number using modulo operation
        int bucketNumber = hashCode % numBuckets;

        return bucketNumber;
    }


}
