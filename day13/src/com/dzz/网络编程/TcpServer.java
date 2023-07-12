package com.dzz.网络编程;

import com.sun.xml.internal.ws.api.message.MessageWritable;
import org.omg.CORBA.INTERNAL;

import java.io.*;
import java.net.*;

class TcpServer {
    public static void main(String[] args) throws IOException {
        /*System.out.println(InetAddress.getLocalHost());
        int port = 10086;
        DatagramSocket socket = new DatagramSocket(port);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        while (true) {
            socket.receive(packet);

            String hostAddress=packet.getAddress().getHostAddress();
            byte[] data=packet.getData();
            int length=packet.getLength();
            String str=new String(data,0,length);
            System.out.println(hostAddress);
            System.out.println(str);
        }*/
        int port=10086;
        ServerSocket serverSocket=new ServerSocket(port);
        System.out.println("服务器启动，绑定端口号"+port);

        Socket socket=serverSocket.accept();
        System.out.println("建立连接");

        InputStream inputStream=socket.getInputStream();
        byte[] bytes= new byte[1024];

        int len=inputStream.read(bytes);

        String data=new String(bytes,0,len);
        System.out.println(data);

        byte[] hostAddress = socket.getInetAddress().getAddress();
        System.out.println(hostAddress);

        inputStream.close();
        socket.close();
        serverSocket.close();




    }
}