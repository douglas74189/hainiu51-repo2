package com.dzz.IO;

//import com.sun.org.apache.xpath.internal.operations.Strinxg;

import java.io.*;

/**
 * @author DouZhouZHi
 */
public class IoInputAndOutput {
    public static void main(String[] args) throws IOException {


        /*FileInputStream ins = new FileInputStream("D:\\桌面\\资料-编程开发\\图书 - 编程\\java面试.pdf");
        FileOutputStream ous = new FileOutputStream("day10\\haha.pdf");
        byte[] b1 = new byte[1024];

        int len;
        while ((len = ins.read(b1)) != -1) {
            ous.write(b1, 0, len);
        }

        ins.close();
        ous.close();*/
/*
        FileOutputStream write=new FileOutputStream("day10\\标准文件写入.txt",true);
        FileInputStream read=new FileInputStream("day10\\标准文件读取.txt");

        byte[] b1={65,66,67,68,88,89,99}  ;
        write.write(b1);
        write.write("\r\n".getBytes());
        write.write("你好我是鸭".getBytes());

        write.close();*/

        /*File f1=new File("day10\\标准文件读取.txt");
        f1.createNewFile();

        FileInputStream fis1 = new FileInputStream("day10\\标准文件读取.txt");
        byte[] b1 = new byte[1024];
        int readlen;

        FileOutputStream fost1 = null;
        try {
            fost1 = new FileOutputStream("day10\\标准文件写入.txt", true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while ((readlen=fis1.read()) != -1) {
            fost1.write(b1,0,readlen);
        }
        fis1.close();
        fost1.close();*/

           /* //根据数据源创建字节输入流对象
            FileInputStream fis = new FileInputStream("day10\\标准文件读取.txt");
            //根据目的地创建字节输出流对象
            FileOutputStream fos = new FileOutputStream("day10\\标准文件写入.txt");

            //读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
            byte[] bys = new byte[1024];
            int len;
            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }

            //释放资源
            fos.close();
            fis.close();*/
      /*  FileInputStream fi1=new FileInputStream("day10\\标准文件读取.txt");
        FileOutputStream fo1=new FileOutputStream(("day10\\标准文件写入"));
        int len;
        byte[] b1=new byte[2048];
        while ((len=fi1.read(b1))!=-1 ){
            fo1.write(b1,0,len);
        }
        fi1.close();
        fo1.close();*/
        /*BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("day10\\标准文件读取.txt"));
        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream(("day10\\标准文件写入.txt")));
        int by;
        while ((by = bis1.read()) != -1) {
            System.out.print(String.valueOf((char)by));
        }

        byte[] b2=new byte[1024];
int len ;
while ((len=bis1.read(b2))!=-1){
    System.out.printf(String.valueOf((char) len));
}*/
       /* BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("D:\\桌面\\窦志洲素材1\\2 图书\\图书 - 国家\\美国秩序的根基.pdf"));
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("D:\\桌面\\美国秩序的根基.pdf"));
        byte[] b2 = new byte[2048];
        int len;
        while ((len = bis2.read(b2)) != -1) {
            bos2.write(b2, 0, len);
        }
        bis2.close();
        bos2.close();
*/

        /*String s="中国";
        byte[] b1=s.getBytes("GBK");
        System.out.println(b1);
        System.out.println(Arrays.toString(b1));
        String ss=new String(b1,"GBK");
        System.out.println(ss);*/

       /* FileWriter fw1=new FileWriter("day10\\filew.txt");

        fw1.write(98);
        fw1.write(97);
        fw1.write(99);
        fw1.write(89);
        fw1.write("\r\n");
        char[] ch={'1','1','2','w','e','M','y','u'};
        fw1.write(ch);
        fw1.write("\r\n");
        fw1.write(ch,2,3);
        fw1.write("\r\n");
        fw1.write("asdfgqwert");
        fw1.write("\r\n");
        fw1.write("asdfgqwert",2,6);



        fw1.close();*/

//        FileReader fr2 = new FileReader("day10\\filew.txt");
     /*   int ch;
        while ((ch=fr2.read())!=-1){
            System.out.print((char    )ch);
        }*/
        /*char[] arraych = new char[1024];
        int ch;
        while ((ch = fr2.read()) != -1) {


        }
        fr2.close();*/

       /* BufferedWriter bw1=new BufferedWriter(new FileWriter("day10\\filew.txt"));
        bw1.write("hello\r\n");
        bw1.write("world\r\n");
        bw1.close();*/
       /* FileWriter fw1=new FileWriter("day10\\b.txt",true);
        fw1.write(95);
        fw1.write(97);
        fw1.write("hello.i am dzz,who are you?");
        fw1.write("\r\n");
        fw1.write("nice to meeyu iamrex,younger you");*/



      /*  while (read.read()!=-1){
            System.out.print(read.read()+"    ");
        }
*/
        /*System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());
        System.out.println(read.read());*/
        /*File f1=new File("D:\\桌面\\作业\\16 集合\\123d.txt");
        File f2=new File("day10");
        File f3=new File("D:\\DevelopProject\\IDEAProject\\JavaStudy51\\day10\\sb\\txt4.txt\\txt3.txt","txt3.txt");

*/

//        System.out.println("f3.mkdir() = " + f3.mkdir());
//        System.out.println("f3.mkdirs() = " + f3.mkdirs());
//        System.out.println(f3.createNewFile());/* System.out.println("f3.isDirectory() = " + f3.isDirectory());
       /* System.out.println("f3.isFile() = " + f3.isFile());
        System.out.println("f3.exists() = " + f3.exists());
        System.out.println("f3.getAbsolutePath() = " + f3.getAbsolutePath());
        System.out.println("f3.getName() = " + f3.getName());
        System.out.println("f3.getPath() = " + f3.getPath());
        System.out.println("f3.listFiles().toString() = " + f2.listFiles());
        File[] lf1=f2.listFiles() ;
        for (File file : lf1) {
            System.out.println("file.toString() = " + file.toString());
        }
*/

 /*       File deleteFile1 = new File("D:\\桌面\\窦志洲素材1");
        if (deleteDic(deleteFile1)) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }*/


        File f1 = new File("D:\\桌面\\资料-编程开发");
        System.out.println("大小是：");
        System.out.println(sumFileSize(f1));

    }

    public static long sumFileSize(File inputFile) {
        long diclength = 0;
        File[] fileArrays = inputFile.listFiles();
        System.out.println("输入的文件夹共有" + fileArrays.length + "个文件");
        if (inputFile.exists()) {
            System.out.println("检测文件存在，程序继续进行");
            for (File f : fileArrays) {
                if (f.isFile()) {
                    System.out.println("该文件是："+f.getName());
                    diclength+=f.length();
                }
                else {
                    diclength+=sumFileSize(f);
                }
            }

        }
        return diclength;


    }

    public static boolean deleteDic(File deleteFile1) {

        if (!deleteFile1.exists() || deleteFile1 == null) {
            System.out.println("文件不存在或者为空");
        }
        File[] listDic = deleteFile1.listFiles();
            /*System.out.println("找到路径，且路径存在");
            System.out.println(listDic);*/

        for (File f : listDic) {
            System.out.println("该文件是  " + f);
            if (f.isDirectory()) {
                System.out.println("该文件夹是  " + f);
                deleteDic(f);
            } else {
                f.delete();
                System.out.println(f.getName() + " 删除成功");
            }

        }
        deleteFile1.delete();
        System.out.println(deleteFile1 + "删除成功");

        return true;
    }
}