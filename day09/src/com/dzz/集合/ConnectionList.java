package com.dzz.集合;


import com.sun.org.apache.bcel.internal.generic.I2B;
import com.sun.xml.internal.ws.api.message.MessageWritable;
import sun.java2d.pipe.SpanIterator;
import sun.management.Agent;
import sun.reflect.generics.tree.Tree;

import javax.lang.model.type.IntersectionType;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;

public class ConnectionList {
    public static void main(String[] args) {
/*        Collection<String> c1=new ArrayList<>();
        c1.add("hello");
        c1.add("world");
        c1.add("java");
        c1.add("javase");
        c1.add("javase");

        Iterator<String> ite=c1.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next() );
        }*/

   /*     ArrayList<String> l1=new ArrayList<>();
        l1.add("a");
        l1.add("ab");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        l1.add("e");
        Iterator<String> lt=l1.iterator();
        while (lt.hasNext()){
            System.out.println(lt.toString());
            String s=lt.next();
            if ("d".equals(s)){
                lt.remove();
            }
        }
        System.out.println(l1);
*/
    /*ArrayList al1=new ArrayList();
    al1.add("aaa");
    al1.add("bbb");
    al1.add("ccc");
    al1.add("ddd");
    al1.add("eee");
    al1.add("fff");
      *//*  for (Object o : al1) {
            System.out.println(o);
        }*//*
        for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }
        System.out.println();
        al1.set(0,"666");
        al1.remove("eee");
        al1.remove(0);
        al1.add(4,123);
        al1.add(1,123);
        al1.add(1,123);
        for (int i=al1.size()-1;i>=0;i--) {
            System.out.println(al1.get(i));
        }
//        System.out.println(al1.size());*/
//        LinkedList ll1 = new LinkedList();
//
//        ll1.add("sad");
//        ll1.add("qwe");
//        ll1.add("zxc");
//        ll1.add("fgh");
//        ll1.add("poi");
//        ll1.addLast("321");
//        ll1.addFirst(123);
/*
        System.out.println("链表的第一个元素"+ll1.getFirst());
        System.out.println("链表的最后一个元素"+ll1.getLast());


        for (Object o : ll1) {
            System.out.println(o);
        }
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst());
        System.out.println("ll1.removeLast() = " + ll1.removeLast());
        for (Object o : ll1) {
            System.out.println(o);*/

/*        ll1.removeIf(o1 -> o1.equals(123));


        for (Object o : ll1) {
            System.out.println(o);
        }*/
        /*Set s1 = new TreeSet();
        s1.add(123);
        s1.add(123);
        s1.add(321);
        s1.add(1234);

        for (Object o : s1) {
            System.out.println(o);
        }
        Iterator it1=s1.iterator();
        while (it1.hasNext()){
            System.out.println("it1.next() = " + it1.next());
        }
        for (Object o : s1) {
            System.out.println(o);
        }*/
        /*HashSet hs1=new HashSet();
        hs1.add("123");
        hs1.add("456");
        hs1.add("789");
        hs1.add(0);
        hs1.add(2);
        hs1.add(3);
        hs1.add(5);
        hs1.add('a');
        hs1.add("8asd");
        hs1.add("9zxc");
        hs1.add("123");
        for (Object o : hs1) {
            System.out.println("o = " + o);
        }
        Iterator i1=hs1.iterator();
        while (i1.hasNext()){
            System.out.println("i1.next() = " + i1.next());
        }


*/
        Student s1 = new Student("tom", 10, '男');
        Student s2 = new Student("tim", 11, 'a');
        Student s3 = new Student("tam", 12, 'b');
        Student s4 = new Student("tem", 10, 'c');
        Student s5 = new Student("tom", 1, '男');
        Student s6 = new Student("tom", 3, '男');
        Student s7 = new Student("tom", 7, '男');
        Student s8 = new Student("tbm", 10, '男');

        Teacher t1=new Teacher("刘达强",13);
        Teacher t2=new Teacher("张三",17);
        Teacher t3=new Teacher("李四",56);
        Teacher t4=new Teacher("王五强",145);
        Teacher t5=new Teacher("赵六强",13);
        Teacher t6=new Teacher("田七强",122);

        HashMap<Student,String> hsm1=new HashMap<>();
        hsm1.put(s1,"shenyang");
        hsm1.put(s2,"changchun");
        hsm1.put(s3,"shijiazhuang");
        hsm1.put(s4,"taiyuan");
        hsm1.put(s5,"wuhan");


/*
        TreeSet<Teacher> ts2=new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if ((o1.getAge()-o2.getAge())!=0) {
                    return o1.getAge()-o2.getAge();
                } else
                {
                    return (o1.getName().compareTo(o2.getName()));
                }

            }
        });

        ts2.add(t1);
        ts2.add(t2);
        ts2.add(t3);
        ts2.add(t4);
        ts2.add(t5);
        ts2.add(t6);

        for (Teacher teacher : ts2) {
            System.out.println(teacher);
        }

        HashSet<Student> hs1 = new HashSet();
        hs1.add(s1);
        hs1.add(s2);
        hs1.add(s3);
        hs1.add(s4);
        hs1.add(s5);
        for (Object o: hs1) {
            System.out.println("student = " + o);
        }*/

       /* TreeSet<Student> ts1 = new TreeSet<>();
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        ts1.add(s5);
        for (Student o : ts1) {
            System.out.println(o);
        }*/
        /*    for (Student o : hs1) {
            System.out.println("o.getAge() = " + o.getAge());
            System.out.println("o.getName() = " + o.getName());
            System.out.println("o.getSex() = " + o.getSex());
        }*/

  /*      TreeSet ts1 = new TreeSet();
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        ts1.add(4);
        ts1.add(5);
        for (Object o : ts1) {
            System.out.println(o);
        }*/

       /* HashMap<String,String> map1=new HashMap();
        map1.put("张三","獐子");
        map1.put("李四","李子");
        map1.put("王五","屋子");
        map1.put("布六","溜子");
        map1.put("啊七","妻子");
        System.out.println(map1.toString());

        Set<String> ks=map1.keySet();
        for (String k : ks) {
            System.out.print(map1.get(k));

        }
        System.out.println();
        Set<Map.Entry<String,String>> s1=map1.entrySet();
        System.out.println(s1);
        for (Map.Entry<String, String> sm : s1) {
            System.out.print(sm.getKey());

        }
        System.out.println( );
        for (Map.Entry<String, String> sm : s1) {
            System.out.print(sm.getValue());
        }
*/



/*
        map1.put("小三","老婆饼");
        map1.remove("张三");
        if (map1.containsKey("小三")){
            map1.put("小四","小三饼");
        }
        System.out.println(map1);
        if (!map1.isEmpty()){
            System.out.println("非空");
        }
        System.out.println(map1.size());*/
       /* Set<String> ks=map1.keySet();
        for (String k : ks) {
            System.out.print(k);
        }
        System.out.println();
        Collection<String> va=map1.values() ;
        for (String s : va) {
            System.out.print            (s    );
        }*/




    }


}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private char sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public int compareTo(Student st) {
        int res = this.age - st.age;

//            res = (Integer.valueOf(this.getName()).intValue() - Integer.valueOf(st.getName()).intValue());
        res = res == 0 ? this.getName().compareTo(st.getName()) : res;


        return res;
    }

}


class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}







