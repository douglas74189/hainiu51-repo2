package com.dzz.集合;

import com.sun.crypto.provider.HmacSHA1;
import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.OBJ_ADAPTER;
import sun.java2d.pipe.SpanIterator;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;

public class Connection {
    public static void main(String[] args) {
        Collection alist1 = new ArrayList();
        //定义多对象

        Son s1 = new Son(21, "tam", 110, 210, 170, '男');
        Son s2 = new Son(31, "tam", 110, 210, 140, '女');
        Son s3 = new Son(51, "tam", 310, 110, 320, '男');
        Son s4 = new Son(21, "tam", 230, 240, 290, '女');
        Son s5 = new Son(15, "tem", 440, 350, 240, '男');
        Son s6 = new Son(6, "tfm", 150, 260, 120, '女');
        Son s7 = new Son(7, "tgm", 120, 370, 360, '男');
        Son s8 = new Son(7, "tgm", 220, 320, 240, '男');
        Son s9 = new Son(19, "tim", 210, 410, 120, '男');
        Son s10 = new Son(19, "tim", 310, 290, 240, '男');
        alist1.add(s1);
        alist1.add(s2);
        alist1.add(s3);
        alist1.add(s4);
        alist1.add(s5);
        alist1.add(s6);
        alist1.add(s7);
        alist1.add(s8);
        alist1.add(s9);
        alist1.add(s10);





/*        for (Object o : alist1) {
            System.out.println(o);
        }
  */
//        alist1.forEach((o)->System.out.println(o));
        LinkedList llist1 = new LinkedList();
        llist1.addAll(alist1);
        LinkedList llist2=new LinkedList();

        for (int i = 1; i < 109; i++) {
            llist1.add(i);
        }
//        llist1.forEach(o -> System.out.println(o));


       /* for (Object o : llist1) {
            System.out.println(o);
        }
        */
//        llist1.forEach(o -> System.out.println(o));


        Collection hs1 = new HashSet();
        hs1.addAll(llist1);
        /*for (Object o : hs1) {
            System.out.println(o);
        }*/

        System.out.println();
//        hs1.forEach(o -> System.out.println(o));

  /*      Iterator ite1 = hs1.iterator();

            while (ite1.hasNext()){
                System.out.println(ite1.next());
            }*/

        /*TreeSet ts1=new TreeSet(new Comparator<Son>() {
            @Override
            public int compare(Son o1, Son o2) {
                return -(o1.getAge()-o2.getAge());
            }
        });*/


        TreeSet ts1 = new TreeSet<Son>();
//        ts1.addAll(hs1);
        /*for (Object o : ts1) {
            System.out.println(o);
        }*/

        TreeSet ts2 = new TreeSet<Son>(new Comparator<Son>() {
            @Override
            public int compare(Son o1, Son o2) {
                int temp;
                temp = -(o1.getCollegeScore() - o2.getCollegeScore());
                temp = temp == 0 ? o1.getAge() - o2.getAge() : temp;
                temp = temp == 0 ? (o1.getName().compareTo(o2.getName())) : temp;
                temp = temp == 0 ? (o1.getPrimaryScore() - o2.getPrimaryScore()) : temp;
                temp = temp == 0 ? (o1.getMiddleScore() - o2.getMiddleScore()) : temp;
                temp = temp == 0 ? o1.getSex() - o2.getSex() : temp;
                return temp;
            }
        });
        ts2.addAll(alist1);
//        ts2.forEach(o -> System.out.println(o));


        Iterator<Son> alistIt = alist1.iterator();
        Iterator<Son> llistIt = llist1.iterator();
        Iterator<Son> hashSetIt = hs1.iterator();
        Iterator<Son> treeSetIt = ts1.iterator();


        while (alistIt.hasNext()) {
            Son i = alistIt.next();
            if (i.getAge() < 20) {
                alistIt.remove();
            }
        }

        /*for (Object o : alist1) {
            System.out.println(o);
        }*/
//        alist1.forEach(o -> System.out.println(o.toString()));
        while (llistIt.hasNext()) {
            Son i1 = llistIt.next();
            if (i1.getMiddleScore() < 300) {
                llistIt.remove();
            }
        }
//        llist1.forEach(i-> System.out.println(i));


        while (hashSetIt.hasNext()) {
            Son S1 = hashSetIt.next();
            if (S1.getPrimaryScore() < 200) {
                hashSetIt.remove();
            }
        }
//        hs1.forEach(o -> System.out.println(o));
        /*for (Object o : hs1) {
            System.out.println(o);
        }*/

       /* while (treeSetIt.hasNext()){
            Son son1=treeSetIt.next();
            if (son1.getSex()=='男')
            {
                treeSetIt.remove();
            }
        }
        ts1.forEach(o -> System.out.println(o));*/

        HashMap hm1 = new HashMap();
        hm1.put(s1, "hello1");
        hm1.put(s2, 2);
        hm1.put(s3, 3.3);
        hm1.put(s4, '就');
        hm1.put(s5, 5);
        hm1.put(s6, 6);
        hm1.put(s7, 7);
        hm1.put(s8, 8);
        hm1.put(s9, 9);
        hm1.put(s10, 10);
        /*Set se1 = hm1.keySet();
//        System.out.println(se1);
        Collection co1 = hm1.values();
//        System.out.println(co1);
        for (Object o : se1) {
            System.out.println("map的键是："+o+"对应的值是："+hm1.get(o));
        }*/
        Set<Map.Entry > me1=hm1.entrySet();
       /* for (Map.Entry entry : me1) {
            System.out.println(entry.getKey()+"是"+entry.getValue());
        }
        me1.forEach((son1)->{
            System.out.println(son1+"是"+son1.getValue());
        });*/




    }
}


class Son implements Comparable<Son> {
    private int age;
    private String name;
    private int primaryScore;
    private int middleScore;
    private int collegeScore;
    private char sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Son son = (Son) o;
        return age == son.age &&
                primaryScore == son.primaryScore &&
                middleScore == son.middleScore &&
                collegeScore == son.collegeScore &&
                sex == son.sex &&
                Objects.equals(name, son.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, primaryScore, middleScore, collegeScore, sex);
    }

    @Override
    public String toString() {
        return "Son{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", primaryScore=" + primaryScore +
                ", middleScore=" + middleScore +
                ", collegeScore=" + collegeScore +
                ", sex=" + sex +
                '}';
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Son(int age, String name, int primaryScore, int middleScore, int collegeScore, char sex) {
        this.age = age;
        this.name = name;
        this.primaryScore = primaryScore;
        this.middleScore = middleScore;
        this.collegeScore = collegeScore;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrimaryScore() {
        return primaryScore;
    }

    public void setPrimaryScore(int primaryScore) {
        this.primaryScore = primaryScore;
    }

    public int getMiddleScore() {
        return middleScore;
    }

    public void setMiddleScore(int middleScore) {
        this.middleScore = middleScore;
    }

    public int getCollegeScore() {
        return collegeScore;
    }

    public void setCollegeScore(int collegeScore) {
        this.collegeScore = collegeScore;
    }

    @Override
    public int compareTo(Son o) {
        int temp;
        temp = -(this.collegeScore - o.collegeScore);
        temp = temp == 0 ? this.age - o.age : temp;
        temp = temp == 0 ? (this.name.compareTo(o.name)) : temp;
        temp = temp == 0 ? (this.primaryScore - o.primaryScore) : temp;
        temp = temp == 0 ? (this.middleScore - o.middleScore) : temp;
        temp = temp == 0 ? this.sex - this.sex : temp;
        return temp;


    }
}