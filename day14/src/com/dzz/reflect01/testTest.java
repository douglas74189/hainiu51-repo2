package com.dzz.reflect01;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

class testTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException, InstantiationException {
        InputStream reStream = ClassLoader.getSystemClassLoader().getResourceAsStream("opp.properties");

        Properties p1 = new Properties();
        p1.load(reStream);

        String classpath = p1.getProperty("classpath");
        String method = p1.getProperty("method");

        Class<?> c1 = Class.forName(classpath);
        Object o = c1.getDeclaredConstructor().newInstance();
       c1.getMethod(method).invoke(o);




    }
}



