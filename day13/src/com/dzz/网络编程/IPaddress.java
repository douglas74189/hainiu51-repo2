package com.dzz.网络编程;

import java.io.IOException;
import java.net.*;
import java.util.HashSet;

public class IPaddress {
    public static void main(String[] args) throws IOException {

        DatagramSocket sockey=new DatagramSocket();

        String str="这是窦治洲用udp发送的数据";
        byte[]bytes=str.getBytes();


        InetAddress addr = InetAddress.getByName("192.168.62.135");
        int port=10086;

        DatagramPacket packet= new DatagramPacket(bytes,bytes.length,addr,port);

        sockey.send(packet);
        sockey.close();

    }













}
