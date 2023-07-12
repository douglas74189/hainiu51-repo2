package com.dzz.file;

import com.sun.jmx.mbeanserver.DynamicMBean2;
import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;

/**
 * @author DouZhouZHi
 */
public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        File f1=new File("day11\\b.txt");
        f1.createNewFile();*/
/*
        FileWriter fw1=new FileWriter("day11\\b.txt");
        fw1.write("hello.i am dzz,who are you?");
        fw1.write("\r\n");
        fw1.write("nice to meeyu iamrex,younger you");
        fw1.close();
        FileReader fr1= new FileReader("day11\\b.txt");
        char[] c1=new char[1024];
        int len;
        while ((len=fr1.read())!=-1)
        {
            System.out.print((char)fr1.read());
        }
        fr1.close();*/
       /* BufferedWriter bw1 = new BufferedWriter(new FileWriter("day11\\b.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("day11\\b.txt"));
        for (int i = 0; i < 5; i++) {
            bw1.write("hello,i am " + i);
            bw1.newLine();
        }
        bw1.close();
*//*        String line;
        while ((line = br1.readLine()) != null) {
            System.out.println(line);
        }*//*
        System.out.println(br1.readLine());
        System.out.println(br1.readLine());
        System.out.println(br1.readLine());
        System.out.println(br1.readLine());
        System.out.println(br1.readLine());
        br1.close();*/
    Student s1=new Student("窦治洲",12,34);
        Student s2=new Student("罗春桃",13,43);
        ArrayList al1=new ArrayList();
       al1= write(s1,s2);
        System.out.println(al1);
read();

    }

    private static ArrayList write(Student s1,Student s2) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\a.txt"));

        //创建对象
        Student s = new Student();
        ArrayList al1=new ArrayList();
        al1.add(s1);
        al1.add(s2);
        //void writeObject(Object obj)：将指定的对象写入ObjectOutputStream
        oos.writeObject(al1);

        //释放资源
        oos.close();
        return al1 ;
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("day11\\a.txt"));
        ArrayList<Student> al1=(ArrayList<Student>)ois1.readObject();
        ois1.close();
        for (Student o : al1) {

            System.out.println((o.getName() + "  "+o.getAge()+"   "+o.getScore()));
        }

    }


}
