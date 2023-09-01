package abhinav.bigintegerdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SampleDecimal {

    public static void main(String[] args) {
        Integer i = 10;//Integer.MAX_VALUE;
        Integer j =20;//Integer.MAX_VALUE;
        System.out.println(i +"  +  "+j);
        Integer sum =i+j;
        System.out.println(sum);
        BigInteger val1 = new BigInteger(String.valueOf(i));

        BigInteger val2 = new BigInteger(String.valueOf(j));

        BigInteger  bigsum = val1.add(val2);

        System.out.println(bigsum.bitCount());
        System.out.println(bigsum.bitLength());


        BigDecimal b = new BigDecimal(34.45);
        BigDecimal d = new BigDecimal(124.45);

        double dvv= b.doubleValue();


        BigDecimal sumd = b.add(d);
        System.out.println(sumd);

    }
}
