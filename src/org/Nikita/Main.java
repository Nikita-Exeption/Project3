package org.Nikita;

import java.math.BigInteger;

public class Main {
    private final static BigInteger BIG_INTEGER = BigInteger.valueOf(65);

    public static void main(String[] args) {
   

        for (BigInteger bi = BigInteger.valueOf(1), bigInteger1 = BigInteger.valueOf(1);
             bi.compareTo(BIG_INTEGER) < 0;
             bi = bi.add(BigInteger.ONE), bigInteger1 = bigInteger1.multiply(BigInteger.valueOf(2))) {

            System.out.println(bi + ":" + bigInteger1);
        }
    }
}