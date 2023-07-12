package com.dzz.网络编程;

import com.sun.xml.internal.ws.api.message.Packet;

import java.io.*;
import java.net.*;

import static org.junit.jupiter.api.Assertions.*;

class Server {

    public static void main(String[] args) throws IOException {


        System.out.println(InetAddress.getLocalHost());
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
        }


    }
}