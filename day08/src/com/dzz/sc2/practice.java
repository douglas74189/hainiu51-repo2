package com.dzz.sc2;

import com.sun.xml.internal.ws.api.message.MessageWritable;
import com.sun.xml.internal.ws.message.stream.StreamHeader11;
import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.SplittableRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practice {
    public static void main(String[] args) throws AgeOutOfHumanRange {

/*        BigDecimal s1 = new BigDecimal("123");
        BigDecimal s2 = new BigDecimal("210");
        BigDecimal s3 = s1.multiply(s2);
        System.out.println(System.currentTimeMillis());
        System.out.println(s3);*/
        /*Date d1 = new Date();
        SimpleDateFormat f1 = new SimpleDateFormat("日期是：yyyy.MM.dd 时间是： HH:mm:ss");
        String string = f1.format(d1);
        System.out.println(string);
        String str1 = "日期是：2023.06.17 时间是： 21:38:19";
        SimpleDateFormat st1=new SimpleDateFormat("日期是：yyyy.MM.dd 时间是： HH:mm:ss");
        Date d2= null;
        try {
            d2 = st1.parse(str1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d2);
         */
        /*System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2020,8,8,0,10,10));
     */
           /* LocalDateTime now = LocalDateTime.now();}
            System.out.println(now);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("日期是：yyyy.MM.dd 时间是： HH:mm:ss");
            String sdtf = dtf.format(now);
            System.out.println(sdtf);

            String st2="日期是：2023.06.17 时间是： 22:09:02";
            LocalDateTime ldt2=LocalDateTime.parse(st2,DateTimeFormatter.ofPattern("日期是：yyyy.MM.dd 时间是： HH:mm:ss"));
            System.out.println(ldt2 );*/
/*
        String s = "12 32 2 3 9 8 7 67 7 8 99 676 865 56 4 65456 4 53 67 78 ";
        String[] s1 = s.split(" ", 0);
//        System.out.println(s1.toString());
        System.out.println(Arrays.toString(s1));
        int[] i1=new int[s1.length];
        for (int i = 0; i < s1.length; i++)
         {
             if (s1[i]==""){
                 continue;
             }
            i1[i]=Integer.valueOf(s1[i]).intValue();
        }
        Arrays.sort(i1);
        System.out.println(Arrays.toString(i1));
        String s2;
        StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < i1.length; i++) {
            sb2.append(i1[i]);
            if (i<i1.length-1) {
                sb2.append(" ");
            }
        }
        System.out.println(sb2.toString());
*/
/*        String s1 = "dw1dw2 @3a32d1w@__sdaw45 91 8914231564";
        System.out.println(s1.indexOf("\\w"));*/

/*        System.out.println(("    " +
                " ").matches("\\s+"));*/

/*        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        Pattern p1=Pattern.compile("1[3-9]\\d{9}");
        Matcher m1=p1.matcher(str);
        if (m1.find()){
            System.out.println("找到可以用的电话呢");
            System.out.println(m1.group());
        }*/
       /* String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";
        s=s.replaceAll("\\.","");
        System.out.println(s  );
        s=s.replaceAll("(.)\\1+","$1");
        System.out.println(s);*/
        Student sd1 = new Student("sd1", 123);
        System.out.println(sd1.getName() + "  " + sd1.getAge());
        String st = "123";
        Integer.valueOf(st).intValue();

    }


}
