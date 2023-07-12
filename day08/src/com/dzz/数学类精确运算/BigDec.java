package com.dzz.数学类精确运算;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static java.lang.String.*;

public class BigDec {
    public static void main(String[] args) throws ParseException {
//        System.out.println(multuply(1, 2));
/*
        Date d1=new Date();
        SimpleDateFormat   sd=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String s1=sd.format(d1  );
        System.out.println(s1);


        SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Date d2=new Date();
        Date str;
        str=sd1.parse("2023-06-17-10-59-26");
        System.out.println(str);
*/

        LocalDateTime lt1= LocalDateTime.now();
        System.out.println(lt1);
//       LocalDateTime lt2=LocalDateTime.of(2013,13,12,2,1);
//        System.out.println(lt2);
//        System.out.println(lt1.getDayOfMonth());
            lt1=lt1.plusDays(2);
        System.out.println(lt1 );
        System.out.println(LocalDate.now());

    }

    public static double multuply(double a, double b) {
        BigDecimal s1 = new BigDecimal(valueOf(a));
        BigDecimal s2 = new BigDecimal(valueOf(b));
        BigDecimal s3=s1.divide(s2);

        return s3.doubleValue();
    }

}
