package com.java.interview.practice1.array;

public class SecondLargestElement
{
    static int secondLargestElement(int a[],int total){
        int temp=0;
        for (int i=0;i<total;i++){
            for (int j=i+1;j<total;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args) {

        int[]  arr= {1,2,3,4,5,9,6,16,13};
        int len = arr.length;
        System.out.println("secondLargest elements: "+secondLargestElement(arr,len));
    }
}
