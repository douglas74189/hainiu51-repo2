package com.dzz.考试;

public class Question3 {

    public static void main(String[] args) {
        arrayRewrite();
    }
    public static void arrayRewrite(){
        int [] arr1={11, 33, 55, 77};
        int [] arr2={22, 44, 66, 88};
        int [] arr3=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i<arr1.length){
                arr3[i]=arr1[i];

            }
            else  if (i>=arr1.length){
                arr3[i]=arr2[i-arr1.length];
            }
            System.out.println(arr3[i]);
        }

    }
}
