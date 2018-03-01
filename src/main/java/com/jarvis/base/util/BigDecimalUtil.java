package com.jarvis.base.util;

import java.math.BigDecimal;

public class BigDecimalUtil {
    public static void main(String[] args) {

        BigDecimal b1 = new BigDecimal(Double.valueOf(a));
        BigDecimal b2 = new BigDecimal(Double.valueOf(b));
        System.out.println(b1.divide(b2,3).doubleValue());


    }

    public static final double a = 2.26;
    public static final double b = 3954.1654;
    //精确度
    /**
     * BigDecimal 加
     *
     * **/

    public static double useBigDecimal(){
        BigDecimal bigDecimal1 = new BigDecimal(a);
        BigDecimal bigDecimal = new BigDecimal(b);
        //加
        return bigDecimal1.add(bigDecimal).doubleValue();
        //减
        //return bigDecimal.subtract(bigDecimal).doubleValue();
        //乘
        //return bigDecimal.multiply(bigDecimal1).doubleValue();

    }



}
