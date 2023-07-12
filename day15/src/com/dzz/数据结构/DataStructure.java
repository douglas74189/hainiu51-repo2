package com.dzz.数据结构;

import java.util.Arrays;
import java.util.Random;

public class DataStructure {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r1 = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r1.nextInt(100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 31));

    }

    public static int binarySearch(int[] arr, int value) {
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while (start<end) {
            if (arr[mid]>value){
                end=mid-1;
                mid=(start+start)/2;
                continue;
            }else if (arr[mid]<value){
                start=mid+1;
                mid=(end+start)/2;
                continue;
            }
            else {
                break;
            }
        }
        if (arr[mid]==value) {
            return mid;
        }
        else {
            return -1;
        }

    }











}
