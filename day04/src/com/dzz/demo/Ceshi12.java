package com.dzz.demo;

import com.sun.imageio.plugins.common.I18N;

import java.util.Arrays;

/**
// *
 */
public class Ceshi12 {
    public static int searchArray(int sNum, int[] sArray) {
        int ifNum = -1;
        for (int i = 0; i < sArray.length; i++) {
            if (sNum == sArray[i]) {
                System.out.println("数字" + sNum + "的位置为：");
                ifNum = 0;
                return (i + 1);
            }
        }
        return ifNum == -1 ? -1 : 0;


    }
    int for1=3;
    public static int[] getPartOfArray(int fIndex, int len, int[] array) {
        int []arr2=new int[len];
        for (int i = 0; i < len; i++) {
            arr2[i]=array[fIndex];
            fIndex++;

        }

        return arr2;
    }

    public static void main(String[] args) {
        /*int[] array1 = {1, 2, 3, 3, 2, 1, 123, 1, 3212, 1, 1, 23, 12, 1, 12};
//        System.out.println(searchArray(1455, array1));
        for (int i = 0; i < getPartOfArray(5,5,array1).length; i++) {
            System.out.print(getPartOfArray(5, 5, array1)[i]+"  ");
        }
        String s = array1.toString();
        Arrays.toString(array1);*/
/*        Object[][] s1=new Object[3][];
        s1[0]= new Object[]{7,8,9};
        s1[1]=new  Object[]{1.1,2.1,2.2,3.3};
        s1[2]=new Object[]{"12313","qe",13,"qew",'1'};
        for (int i = 0; i < s1.length; i++) {

            System.out.println(s1[i]);
            for (int i1 = 0; i1 < s1[i].length; i1++) {
                System.out.println(s1[i][i1].toString()+"  ");
            }
        }*/

        Object[] o1={"13",3,1,2.2,"3asda"};
        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i]);


        }
    }


}
